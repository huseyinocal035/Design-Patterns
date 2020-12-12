package DecoratorPattern;

public abstract class Decorator implements Kunefe {

    protected Kunefe kunefe;

    public Decorator(Kunefe kunefe) {
        this.kunefe = kunefe;
    }

    @Override
    public int getCost() {
        return this.kunefe.getCost();
    }

    @Override
    public String getDescription() {
        return this.kunefe.getDescription();
    }
}
