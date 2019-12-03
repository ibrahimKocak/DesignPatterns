package BehavioralDesignPatterns.State.MobileAlert;

import TestDesignPatern.Test;

public class zzTestStateMobileAlert extends Test {

    @Override
    public void start() {
        super.start();

        AlertStateContext alertStateContext = new AlertStateContext();
        alertStateContext.alert();

        alertStateContext.changeState(new Silent());
        alertStateContext.alert();

        alertStateContext.changeState(new Vibration());
        alertStateContext.alert();
    }
}
