package NullObjectPattern;

import java.util.List;

public class PlayerFactory {

    List<String> playerNames;

    private Team team;

    public PlayerFactory(List<String> playerNames) {
        this.team = new Team(playerNames);
    }

    public Player getPlayer(String playerName) {
        if (checkName(playerName)) {
            return new RealPlayer(playerName);
        }
        return new NullPlayer();
    }

    private boolean checkName(String playerName) {
        if (team.existPlayer(playerName)) {
            return true;
        }
        return false;
    }
}
