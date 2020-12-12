package FacadePattern;

public class PlayerManager {

    private Player footballPlayer;

    private Player basketballPlayer;

    private Player volleyballPlayer;

    public PlayerManager() {
        this.footballPlayer = new FootballPlayer();
        this.basketballPlayer = new BasketballPlayer();
        this.volleyballPlayer = new VolleyballPlayer();
    }

    public void makeFootballPlayer() {
        footballPlayer.make();
    }

    public void makeBasketballPlayer() {
        basketballPlayer.make();
    }

    public void makeVolleyballPlayer() {
        volleyballPlayer.make();
    }


}
