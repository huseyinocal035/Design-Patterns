package TemplatePattern;

public class Honda extends Car{

    @Override
    void start() {
        System.out.println("Honda car is starting...");
    }

    @Override
    void drive() {
        System.out.println("Honda car is being driven...");
    }

    @Override
    void stop() {
        System.out.println("Honda car is stoping...");
    }
}
