package NullObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> playerNames = new ArrayList<>();
        playerNames.add("Hüseyin");
        playerNames.add("Okan");
        playerNames.add("Mustafa");
        playerNames.add("Ali");
        playerNames.add("ÖmerHalid");

        PlayerFactory playerFactory = new PlayerFactory(playerNames);
        System.out.println(playerFactory.getPlayer("hüseyin").getPlayerName());
        System.out.println(playerFactory.getPlayer("okan").getPlayerName());
        System.out.println(playerFactory.getPlayer("mustafa").getPlayerName());
        System.out.println(playerFactory.getPlayer("yatabare").getPlayerName());
        System.out.println(playerFactory.getPlayer("ali").getPlayerName());
        System.out.println(playerFactory.getPlayer("ömerhalid").getPlayerName());
        System.out.println(playerFactory.getPlayer("hasan").getPlayerName());

    }
}
