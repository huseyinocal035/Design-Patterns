package StrategyPattern;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setStrategy(new Divison());
        manager.operation(78, 21);
    }
}
