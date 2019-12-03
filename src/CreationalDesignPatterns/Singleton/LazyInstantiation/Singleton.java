package CreationalDesignPatterns.Singleton.LazyInstantiation;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}

//Thread not safe