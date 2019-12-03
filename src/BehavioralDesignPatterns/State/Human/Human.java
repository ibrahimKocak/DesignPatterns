package BehavioralDesignPatterns.State.Human;

public class Human {

    private State state;

    public Human() {
        state = new Stop();
    }

    public void action() {
        state.action();
    }

    public void changeState(State state) {
        this.state = state;
    }
}
