package CommandPattern;

public class ShortPassCommand implements Command{

    private Key key;

    public ShortPassCommand(Key key) {
        this.key = key;
    }

    @Override
    public void execute() {
        key.shortPass();
    }
}
