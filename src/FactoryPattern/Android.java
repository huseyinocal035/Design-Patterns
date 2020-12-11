package FactoryPattern;

public class Android implements SmartPhone {

    @Override
    public void make() {
        System.out.println("Android smart phone is making");
    }

}
