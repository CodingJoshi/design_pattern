package design.pattern.creational.singleton;

/**
 * create your Singleton eagerly
 * It will create the class even if it is not required
 */
public class SingletonC {
    private static final SingletonC uniqueInstance = new SingletonC();

    private SingletonC() {
    }

    public static SingletonC getInstance() {
        return uniqueInstance;
    }
}
