package CommandPattern;

public class ShootCommand implements Command {

    private Key key;

    public ShootCommand(Key key) {
        this.key = key;
    }

    @Override
    public void execute() {
        key.shoot();
    }
}
