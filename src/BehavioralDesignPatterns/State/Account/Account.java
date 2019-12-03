package BehavioralDesignPatterns.State.Account;

public class Account {

    private AccountStatus accountStatus;

    public Account() {
        accountStatus = new NormalAccount();
    }

    public void payInterest() {
        accountStatus.payInterest();
    }

    public void takeMoney() {
        accountStatus.takeMoney();
    }

    public void chanceStatus(final AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
        System.out.println("***Normal account upgraded to Gold account***");
    }
}
