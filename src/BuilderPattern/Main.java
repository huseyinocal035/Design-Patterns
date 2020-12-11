package BuilderPattern;

public class Main {

    public static void main(String[] args) {

        Car car = new Car.Builder("PSA", "Bridgestone", "Carbon Fiber Body")
            .setSunroof("Panaromic Glass Ceiling")
            .setRim("Vosseb")
            .build();

        System.out.println(car);
    }

}
