package FactoryPattern;

public class Main {

    public static void main(String[] args) {

        SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();

        SmartPhone android = smartPhoneFactory.getOperationSystem(SmartPhoneFactory.ANDROID);
        SmartPhone ios = smartPhoneFactory.getOperationSystem(SmartPhoneFactory.IOS);

        android.make();
        ios.make();

    }
}
