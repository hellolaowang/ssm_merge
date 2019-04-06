package com.like.service.impl;

import com.like.dao.AccountDao;
import com.like.domain.Account;
import com.like.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService
{
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll()
    {
        System.out.println("业务层查询所有");
        List<Account> accounts = accountDao.findAll();
        System.out.println(accounts);
        return null;
    }

    @Override
    public void saveAccount(Account account)
    {
        accountDao.saveAccount(account);
    }
}
