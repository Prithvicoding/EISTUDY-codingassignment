package structural;

// Target interface
interface Target {
    void request();
}

// Adaptee class
class Adaptee {
    void specificRequest() {
        System.out.println("Specific request");
    }
}

// Adapter class
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

// AdapterPattern class
public class AdapterPattern {
    public void runExample() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
