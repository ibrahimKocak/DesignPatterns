package CreationalDesignPatterns.Singleton.EarlyInstantiation;

public class Singleton {
    private static Singleton ourInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return ourInstance;
    }
}

//Thread not safe
