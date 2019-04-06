package com.like.controller;

import com.like.domain.Account;
import com.like.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController
{
    @Autowired
    private AccountService accountService;

    @RequestMapping("findAll")
    public String index()
    {
        System.out.println("表现层查询");
        List<Account> accounts = accountService.findAll();
        return "success";
    }

    @RequestMapping("save")
    public String save(Account account)
    {
        accountService.saveAccount(account);
        return "list";
    }


}
