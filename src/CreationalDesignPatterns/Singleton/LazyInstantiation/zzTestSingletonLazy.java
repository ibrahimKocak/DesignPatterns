package CreationalDesignPatterns.Singleton.LazyInstantiation;

import TestDesignPatern.Test;

public class zzTestSingletonLazy extends Test {

    public void start() {
        super.start();

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 != null && instance1 == instance2)
            System.out.println("Objects are the same instance");
    }
}
