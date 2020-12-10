package TemplatePattern;

public abstract class Car {

    abstract void  start();

    abstract void drive();

    abstract void stop();

    public void travelWithCar() {
        start();
        drive();
        stop();
    }
}
