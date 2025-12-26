package Controllers;

import Commands.Command;

public class SimpleRemoteControl {
    Command slotCommand;

    public SimpleRemoteControl() {
    }

    public void setSlotCommand(Command slotCommand) {
        this.slotCommand = slotCommand;
    }

    public void onButtonPress() {
        slotCommand.execute();
    }
}
