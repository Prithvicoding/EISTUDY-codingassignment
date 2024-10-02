package behavioral;

// Strategy interface
interface Strategy {
    int execute(int a, int b);
}

// ConcreteStrategy for Addition
class AdditionStrategy implements Strategy {
    public int execute(int a, int b) {
        return a + b;
    }
}

// ConcreteStrategy for Subtraction
class SubtractionStrategy implements Strategy {
    public int execute(int a, int b) {
        return a - b;
    }
}

// Context class
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

// StrategyPattern class
public class StrategyPattern {
    public void runExample() {
        Context context = new Context();

        context.setStrategy(new AdditionStrategy());
        System.out.println("Addition: " + context.executeStrategy(5, 3));

        context.setStrategy(new SubtractionStrategy());
        System.out.println("Subtraction: " + context.executeStrategy(5, 3));
    }
}
