package com.geely.design.pattern.structural.bridge;


public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAcount = icbcBank.openAccount();
        icbcAcount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new DepositAccount());
        Account icbcAcount2 = icbcBank2.openAccount();
        icbcAcount2.showAccountType();

        Bank abcBank = new ICBCBank(new SavingAccount());
        Account abcAcount = abcBank.openAccount();
        abcAcount.showAccountType();

    }
}
