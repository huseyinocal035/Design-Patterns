package StrategyPattern;

public class Subtraction implements Strategy {

    @Override
    public void operation(int number1, int number2) {
        System.out.println( "Subtraction Result is : " + (number1 - number2));
    }
}
