package CommandPattern;

// Receiver in Command Pattern
public class Key {

    public void shoot() {
        System.out.println("Shooting");
    }

    public void shortPass() {
        System.out.println("Giving short pass");
    }

    public void longPass() {
        System.out.println("Giving long pass");
    }

    public void throughBall() {
        System.out.println("Making through ball");
    }

    public void sprint() {
        System.out.println("Sprinting");
    }

    public void playerModifier() {
        System.out.println("Modifying player");
    }
}
