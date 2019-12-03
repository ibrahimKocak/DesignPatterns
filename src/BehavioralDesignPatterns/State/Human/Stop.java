package BehavioralDesignPatterns.State.Human;

public class Stop implements State {
    @Override
    public void action() {
        System.out.println("stopped");
    }
}
