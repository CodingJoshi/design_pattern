package design.pattern.creational.singleton;

/**
 * Will not work in case of multi threading
 */
public class SingletonA {

    private static SingletonA uniqueInstance;

    private SingletonA() {
    }


    public static SingletonA getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonA();
        }
        return uniqueInstance;
    }


}
