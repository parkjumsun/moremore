package com.ssafy.accountservice.account.infrastructure.repository;

import com.ssafy.accountservice.account.infrastructure.repository.entity.AccountEntity;
import com.ssafy.accountservice.account.mapper.AccountObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

    private final AccountMybatisMapper accountMybatisMapper;
    private final AccountObjectMapper accountObjectMapper;

    @Override
    public void saveAccount(ArrayList<String> arrayList) {
        AccountEntity accountEntity = accountObjectMapper.fromDomainToEntity(arrayList);
        accountMybatisMapper.insertAccount(accountEntity);
    }
}
