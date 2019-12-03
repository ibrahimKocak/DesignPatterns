package BehavioralDesignPatterns.State.MobileAlert;

public class Vibration implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("vibration!");
    }
}
