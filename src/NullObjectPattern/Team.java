package NullObjectPattern;

import java.util.List;

public class Team {

    private List<String> playerNames;

    public Team(List<String> playerNames) {
        this.playerNames = playerNames;
    }

    public boolean existPlayer(String playerName) {
        for (String string : playerNames) {
            if (string.equalsIgnoreCase(playerName)) {
                return true;
            }
        }
        return false;
    }
}

