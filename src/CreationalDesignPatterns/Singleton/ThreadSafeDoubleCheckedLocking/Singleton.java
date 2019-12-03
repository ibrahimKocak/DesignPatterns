package CreationalDesignPatterns.Singleton.ThreadSafeDoubleCheckedLocking;

public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {

            //To make thread safe
            synchronized (Singleton.class) {

                //check again as multiple threads
                //can reach above step
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
