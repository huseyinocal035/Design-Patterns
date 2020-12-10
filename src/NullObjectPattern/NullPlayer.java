package NullObjectPattern;

public class NullPlayer extends Player{

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getPlayerName() {
        return "There is no player with this name in the team.";
    }
}
