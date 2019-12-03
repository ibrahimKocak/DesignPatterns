package BehavioralDesignPatterns.State.Account;

public class NormalAccount implements AccountStatus {
    @Override
    public void takeMoney() {
        System.out.println("Money taken from normal account");
    }

    @Override
    public void payInterest() {
        System.out.println("Interest paid from normal account");
    }
}
