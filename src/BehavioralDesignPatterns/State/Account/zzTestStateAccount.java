package BehavioralDesignPatterns.State.Account;

import TestDesignPatern.Test;

public class zzTestStateAccount extends Test {

    @Override
    public void start() {
        super.start();

        Account account = new Account();

        account.takeMoney();
        account.payInterest();

        account.chanceStatus(new GoldAccount());

        account.takeMoney();
        account.payInterest();
    }
}
