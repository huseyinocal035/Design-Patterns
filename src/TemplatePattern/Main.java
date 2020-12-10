package TemplatePattern;

public class Main {

    public static void main(String[] args) {
        Car car = new BMW();

        car.start();
        car.drive();
        car.stop();

        car = new Mercedes();

        car.start();
        car.drive();
        car.stop();

        car = new Honda();

        car.start();
        car.drive();
        car.stop();
    }

}
