import React from 'react';
import '@/assets/css/common/Main.css';
import datas from '@/components/main/data.json';
import Group from '../components/main/Group';

const Main = () => {
	const groups = datas.groups;
	return (
		<div className="main-container">
			<div className="main-profile-area">
				<div className="main-profile-title">내 정보</div>
				<div className="main-profile-data">
					<img
						className="main-profile-image"
						src="/feed/jinsukProfile.png"
						alt="프로필 이미지"
					/>
					<div className="main-profile-info">
						<div className="main-profile-name">옥진석님</div>
						<div className="main-profile-bank-info">
							<img
								className="main-bank-logo"
								src="/main/BNK.png"
								alt="은행로고"
							/>
							<div className="main-bank-name">경남</div>
							<div className="main-account-number">578-21-0227054</div>
						</div>
						<div className="main-profile-balance">394,227원</div>
					</div>
				</div>
			</div>
			<div className="main-groups-area">
				<div className="main-groups-title">내 그룹</div>
				<div className="main-groups-list">
					{groups ? (
						groups.map((group) => (
							<Group
								key={group.groupId}
								group={group}
							/>
						))
					) : (
						<div className="main-no-groups-message">그룹이 없습니다.</div>
					)}
				</div>
			</div>
		</div>
	);
};

export default Main;
