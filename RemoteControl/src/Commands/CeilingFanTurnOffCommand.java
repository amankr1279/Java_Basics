package Commands;

import Appliance.CeilingFan;

public class CeilingFanTurnOffCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanTurnOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.turnOffFan();
    }

    @Override
    public void undo() {
        ceilingFan.undoSpeed();
    }
}
