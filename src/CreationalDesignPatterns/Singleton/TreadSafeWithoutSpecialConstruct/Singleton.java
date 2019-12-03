package CreationalDesignPatterns.Singleton.TreadSafeWithoutSpecialConstruct;

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
