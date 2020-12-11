package FactoryPattern;

public class IOS implements SmartPhone {

    @Override
    public void make() {
        System.out.println("iOS smart phone is making");
    }

}
