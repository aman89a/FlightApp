package com.company.services;

import com.company.models.Account;
import com.company.models.Plane;
import com.company.services.impl.AccountServiceImpl;

import java.util.List;

public interface AccountService {

    AccountService INSTANCE = new AccountServiceImpl();

    void saveAccount(Account аccount);
    List<Account> getAccounts();
}
