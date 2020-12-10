package StrategyPattern;

public class Addition implements Strategy  {

    @Override
    public void operation(int number1, int number2) {
        System.out.println( "Addition Result is : " + (number1 + number2));
    }
}
