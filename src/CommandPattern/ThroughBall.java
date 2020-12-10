package CommandPattern;

public class ThroughBall implements Command{

    private Key key;

    public ThroughBall(Key key) {
        this.key = key;
    }

    @Override
    public void execute() {
        key.throughBall();
    }
}
