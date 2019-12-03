package BehavioralDesignPatterns.Observer.Digits;

public class BinaryObserver extends Observer {

    BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary Strings: " + Integer.toBinaryString(subject.getState()));
    }
}
