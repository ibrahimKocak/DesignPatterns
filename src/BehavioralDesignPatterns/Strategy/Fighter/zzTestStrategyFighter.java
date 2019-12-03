package BehavioralDesignPatterns.Strategy.Fighter;

import TestDesignPatern.Test;

public class zzTestStrategyFighter extends Test {

    @Override
    public void start() {
        super.start();

        JumpBehavior shortJump = new ShortJump();
        JumpBehavior longJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        Fighter ken = new Ken(tornadoKick, shortJump);
        ken.display();

        ken.punch();
        ken.kick();
        ken.jump();

        ken.setJumpBehavior(longJump);
        ken.jump();
    }
}
