package BehavioralDesignPatterns.Observer.Digits;

import TestDesignPatern.Test;

public class zzTestObserverDigits extends Test {

    @Override
    public void start() {
        super.start();

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change 15");
        subject.setState(15);
        System.out.println("First state change 10");
        subject.setState(10);

    }
}
