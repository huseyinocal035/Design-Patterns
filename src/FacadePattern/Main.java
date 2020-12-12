package FacadePattern;

public class Main {

    public static void main(String[] args) {

        PlayerManager playerManager = new PlayerManager();

        playerManager.makeFootballPlayer();
        playerManager.makeBasketballPlayer();
        playerManager.makeVolleyballPlayer();

    }

}
