package design.pattern.creational.singleton;

/**
 * Multithreaded problem can be solved using syncronised keyword
 * but this is expensive
 */
public class SingletonB {
    private static SingletonB uniqueInstance;

    private SingletonB() {
    }

    public static synchronized SingletonB getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new SingletonB();
        return uniqueInstance;
    }

}
