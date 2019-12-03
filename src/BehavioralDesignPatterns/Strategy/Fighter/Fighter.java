package BehavioralDesignPatterns.Strategy.Fighter;

public abstract class Fighter {

    private KickBehavior kickBehavior;
    private JumpBehavior jumpBehavior;

    Fighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        this.kickBehavior = kickBehavior;
        this.jumpBehavior = jumpBehavior;
    }

    void punch() {
        System.out.println("Default punch");
    }

    void kick() {
        kickBehavior.kick();
    }

    void jump() {
        jumpBehavior.jump();
    }

    public void rool() {
        System.out.println("Default rool");
    }

    public void setKickBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }

    void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public abstract void display();
}
