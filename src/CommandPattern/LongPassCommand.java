package CommandPattern;

public class LongPassCommand implements Command{

    private Key key;

    public LongPassCommand(Key key) {
        this.key = key;
    }

    @Override
    public void execute() {
        key.longPass();
    }
}
