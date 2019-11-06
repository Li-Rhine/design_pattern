package com.geely.design.pattern.structural.bridge;

public class ICBCBank extends Bank{
    public ICBCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
