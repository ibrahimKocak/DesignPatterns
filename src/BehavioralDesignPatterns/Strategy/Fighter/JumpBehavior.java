package BehavioralDesignPatterns.Strategy.Fighter;

public interface JumpBehavior {
    void jump();
}

class ShortJump implements JumpBehavior {

    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
}

class LongJump implements JumpBehavior {

    @Override
    public void jump() {
        System.out.println("Long Jump");
    }
}
