package org.example.composites;

import org.example.interfaces.Command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for(Command c : commands){
            c.execute();
        }
    }
}
