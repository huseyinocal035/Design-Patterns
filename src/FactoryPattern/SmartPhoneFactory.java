package FactoryPattern;

public class SmartPhoneFactory {

    public static final String ANDROID = "Android";

    public static final String IOS = "iOS";

    public SmartPhone getOperationSystem(String type) {

        switch (type) {
            case ANDROID:
                return new Android();
            case IOS:
                return new IOS();
            default:
                return null;
        }
    }
}
