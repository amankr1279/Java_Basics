package Commands;

import Appliance.CeilingFan;

public class CeilingFanSetSpeedHighCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanSetSpeedHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.setSpeedHigh();
    }

    @Override
    public void undo() {
        ceilingFan.undoSpeed();
    }
}
