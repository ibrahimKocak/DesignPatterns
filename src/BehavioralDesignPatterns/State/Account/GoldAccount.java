package BehavioralDesignPatterns.State.Account;

public class GoldAccount implements AccountStatus {
    @Override
    public void takeMoney() {
        System.out.println("Money taken from gold account");
    }

    @Override
    public void payInterest() {
        System.out.println("Interest paid from gold account");
    }
}
