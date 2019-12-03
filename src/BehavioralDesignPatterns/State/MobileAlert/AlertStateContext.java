package BehavioralDesignPatterns.State.MobileAlert;

public class AlertStateContext {

    private MobileAlertState currentState;

    public AlertStateContext() {
        currentState = new Vibration();
    }

    public void changeState(MobileAlertState mobileAlertState) {
        currentState = mobileAlertState;
        System.out.println("***Alert state changed to " + mobileAlertState.getClass().getSimpleName() + "***");
    }

    public void alert() {
        currentState.alert();
    }
}
