 
package creational;

// Singleton class
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// SingletonPattern class
public class SingletonPattern {
    public void runExample() {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
