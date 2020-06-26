package com.company.controllers;

import com.company.models.Account;
import com.company.services.AccountService;

public class AccountController {

    AccountService accountService = AccountService.INSTANCE;

    public void saveAccount(){

        Account account = new Account();
        accountService.saveAccount(account);
    }
}
