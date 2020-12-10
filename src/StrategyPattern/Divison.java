package StrategyPattern;

public class Divison implements Strategy {

    @Override
    public void operation(int number1, int number2) {
        float result = (float) number1 / number2;
        System.out.println( "Division Result is : " + result);
    }
}
