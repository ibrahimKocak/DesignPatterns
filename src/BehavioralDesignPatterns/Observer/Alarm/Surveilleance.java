package BehavioralDesignPatterns.Observer.Alarm;

public class Surveilleance extends CheckList implements AlarmListener {
    public void alarm() {
        System.out.println("Surveillance - by the number");
        byTheNumbers();
    }

    protected void isolate() {
        System.out.println("    train the cameras");
    }
}
