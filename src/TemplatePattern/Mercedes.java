package TemplatePattern;

public class Mercedes extends Car{

    @Override
    void start() {
        System.out.println("Mercedes car is starting...");
    }

    @Override
    void drive() {
        System.out.println("Mercedes car is being driven...");
    }

    @Override
    void stop() {
        System.out.println("Mercedes car is stoping...");
    }
}
