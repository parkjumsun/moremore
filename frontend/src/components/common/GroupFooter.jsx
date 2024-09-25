import React from 'react';

import '@/assets/css/common/groupFooter.css';

import boardOn from '@/assets/img/common/groupFooter/board-on.svg';
import boardOff from '@/assets/img/common/groupFooter/board-off.svg';
import accountOn from '@/assets/img/common/groupFooter/account-on.svg';
import accountOff from '@/assets/img/common/groupFooter/account-off.svg';
import calendarOn from '@/assets/img/common/groupFooter/calendar-on.svg';
import calendarOff from '@/assets/img/common/groupFooter/calendar-off.svg';
import settingOn from '@/assets/img/common/groupFooter/setting-on.svg';
import settingOff from '@/assets/img/common/groupFooter/setting-off.svg';
import { useLocation } from 'react-router-dom';

const Footer = () => {
	const location = useLocation();
	if (
		location.pathname === '/' ||
		location.pathname == '/login' ||
		location.pathname == '/signup' ||
		location.pathname == '/profile' ||
		location.pathname == '/notice' ||
		location.pathname == '/group/:groupId/account/transfer' ||
		location.pathname == '/group/:groupId/account/transfer-question' ||
		location.pathname == '/group/:groupId/account/transfer-check'
	)
		return null;

	return (
		<footer>
			<div className="navbar">
				<img src={boardOff}></img>
				<img src={accountOff}></img>
				<img src={calendarOff}></img>
				<img src={settingOff}></img>
			</div>
		</footer>
	);
};

export default Footer;
