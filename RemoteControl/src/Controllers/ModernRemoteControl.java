package Controllers;

import Commands.Command;
import Commands.NoCommand;

import java.util.ArrayList;
import java.util.List;

public class ModernRemoteControl {
    private final List<Command> onCommands = new ArrayList<Command>();
    private final List<Command> offCommands = new ArrayList<Command>();
    private Command undoCommand;


    public ModernRemoteControl(int buttonCnt) {
        System.out.println("This is a modern remote control with multiple slots");
        for (int i = 0; i < buttonCnt; i++) {
            onCommands.add(new NoCommand());
            offCommands.add(new NoCommand());
        }
        undoCommand = new NoCommand();
    }
    
    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands.set(slot, onCommand);
        offCommands.set(slot, offCommand);
    }

    public void onButtonPress(int slot) {
        System.out.println("Press ON Button");
        undoCommand = onCommands.get(slot);
        onCommands.get(slot).execute();
    }

    public void offButtonPress(int slot) {
        System.out.println("Press OFF Button");
        undoCommand = offCommands.get(slot);
        offCommands.get(slot).execute();
    }

    public void undoButtonPress() {
        System.out.println("Press UNDO Button");
        undoCommand.undo();
    }
}
