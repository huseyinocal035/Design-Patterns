package StrategyPattern;

public class Multiplication implements Strategy {

    @Override
    public void operation(int number1, int number2) {
        System.out.println( "Multiplication Result is : " + (number1 * number2));
    }
}
