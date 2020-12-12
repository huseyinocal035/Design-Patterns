package DecoratorPattern;

public class Pistachio extends Decorator{

    private Kunefe kunefe;

    public Pistachio(Kunefe kunefe) {
        super(kunefe);
        this.kunefe = kunefe;
    }

    @Override
    public int getCost() {
        return this.kunefe.getCost() + 7;
    }

    @Override
    public String getDescription() {
        return this.kunefe.getDescription() + " + Antep Fıstığı";
    }
}
