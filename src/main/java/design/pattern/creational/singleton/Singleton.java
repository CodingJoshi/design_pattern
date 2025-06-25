package design.pattern.creational.singleton;

/**
 * With double-checked locking, we first check to see if an instance is created,
 * and if not, THEN we synchronize.
 * This way, we only synchronize the first time through, just what we want.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null)
                    uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
