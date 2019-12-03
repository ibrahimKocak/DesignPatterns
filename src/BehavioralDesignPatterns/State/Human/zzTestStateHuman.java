package BehavioralDesignPatterns.State.Human;

import TestDesignPatern.Test;

public class zzTestStateHuman extends Test {

    @Override
    public void start() {
        super.start();

        Human jinx = new Human();
        jinx.action();

        jinx.changeState(new Run());
        jinx.action();

        jinx.changeState(new Walk());
        jinx.action();
    }
}
