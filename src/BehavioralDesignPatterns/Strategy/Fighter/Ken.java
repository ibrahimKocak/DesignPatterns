package BehavioralDesignPatterns.Strategy.Fighter;

public class Ken extends Fighter {

    Ken(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("Ken");
    }
}
