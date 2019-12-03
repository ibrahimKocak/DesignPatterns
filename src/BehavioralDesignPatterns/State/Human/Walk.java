package BehavioralDesignPatterns.State.Human;

public class Walk implements State {
    @Override
    public void action() {
        System.out.println("walking");
    }
}
