package CommandPattern;

public class Main {

    public static void main(String[] args) {
        GameConsole gameConsole = new GameConsole();

        Key key = new Key();

        ShootCommand shootCommand = new ShootCommand(key);
        ShortPassCommand shortPassCommand = new ShortPassCommand(key);
        LongPassCommand longPassCommand = new LongPassCommand(key);
        ThroughBall throughBall = new ThroughBall(key);
        SprintCommand sprintCommand = new SprintCommand(key);
        PlayerModifierCommand playerModifierCommand = new PlayerModifierCommand(key);

        gameConsole.addCommand(shootCommand);
        gameConsole.addCommand(shortPassCommand);
        gameConsole.addCommand(longPassCommand);
        gameConsole.addCommand(throughBall);
        gameConsole.addCommand(sprintCommand);
        gameConsole.addCommand(playerModifierCommand);

        gameConsole.executeCommands();
    }
}
