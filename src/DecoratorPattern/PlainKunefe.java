package DecoratorPattern;

public class PlainKunefe implements Kunefe {

    @Override
    public int getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "Sade Künefe";
    }
}
