package StrategyPattern;

public class Manager implements Strategy {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void operation(int number1, int number2) {
        strategy.operation(number1, number2);
    }
}
