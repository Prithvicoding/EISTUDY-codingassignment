public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Pattern Example:");
        new behavioral.ObserverPattern().runExample();

        System.out.println("\nStrategy Pattern Example:");
        new behavioral.StrategyPattern().runExample();

        System.out.println("\nSingleton Pattern Example:");
        new creational.SingletonPattern().runExample();

        System.out.println("\nShape Factory Example:");
        new creational.ShapeFactoryPattern().runExample();

        System.out.println("\nAdapter Pattern Example:");
        new structural.AdapterPattern().runExample();

        System.out.println("\nDecorator Pattern Example:");
        new structural.DecoratorPattern().runExample();
    }
}
