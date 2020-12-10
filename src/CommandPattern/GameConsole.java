package CommandPattern;

import java.util.ArrayList;
import java.util.List;

// Invoker in Command Pattern
public class GameConsole {

    public List<Command> commandList;

    public GameConsole() {
        this.commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
