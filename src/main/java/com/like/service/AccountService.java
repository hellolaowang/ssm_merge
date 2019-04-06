package com.like.service;

import com.like.domain.Account;

import java.util.List;

public interface AccountService
{
    List<Account> findAll();

    void saveAccount(Account account);
}
