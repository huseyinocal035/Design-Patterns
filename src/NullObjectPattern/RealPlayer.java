package NullObjectPattern;

public class RealPlayer extends Player{

    private String playerName;

    public RealPlayer(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getPlayerName() {
        return playerName;
    }
}
