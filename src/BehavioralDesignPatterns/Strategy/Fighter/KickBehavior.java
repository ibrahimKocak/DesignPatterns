package BehavioralDesignPatterns.Strategy.Fighter;

public interface KickBehavior {
    void kick();
}

class LightningKick implements KickBehavior {

    @Override
    public void kick() {
        System.out.println("Lightning Kick");
    }
}

class TornadoKick implements KickBehavior {

    @Override
    public void kick() {
        System.out.println("Tornado Kick");
    }
}
