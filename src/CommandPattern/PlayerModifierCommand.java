package CommandPattern;

public class PlayerModifierCommand implements Command{

    private Key key;

    public PlayerModifierCommand(Key key) {
        this.key = key;
    }

    @Override
    public void execute() {
        key.playerModifier();
    }
}
