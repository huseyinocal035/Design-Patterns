package CommandPattern;

public class SprintCommand implements Command{

    private Key key;

    public SprintCommand(Key key) {
        this.key = key;
    }

    @Override
    public void execute() {
        key.sprint();
    }
}
