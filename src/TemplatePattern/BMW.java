package TemplatePattern;

public class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW car is starting...");
    }

    @Override
    void drive() {
        System.out.println("BMW car is being driven...");
    }

    @Override
    void stop() {
        System.out.println("BMW car is stoping...");
    }
}
