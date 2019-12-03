package BehavioralDesignPatterns.Observer.Alarm;

public class CheckList {

    void byTheNumbers() {
        localize();
        isolate();
        identify();
    }

    protected void localize() {
        System.out.println("    establish a perimater");
    }

    protected void isolate() {
        System.out.println("    isolate the grid");
    }

    protected void identify() {
        System.out.println("    identify the sources");
    }
}
