package DecoratorPattern;

public class MarasIceCream extends Decorator{

    private Kunefe kunefe;

    public MarasIceCream(Kunefe kunefe) {
        super(kunefe);
        this.kunefe = kunefe;
    }

    @Override
    public int getCost() {
        return this.kunefe.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return this.kunefe.getDescription() + " + Maraş Dondurması";
    }
}
