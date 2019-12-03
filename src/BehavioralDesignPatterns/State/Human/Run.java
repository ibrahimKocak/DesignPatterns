package BehavioralDesignPatterns.State.Human;

public class Run implements State {
    @Override
    public void action() {
        System.out.println("running");
    }
}
