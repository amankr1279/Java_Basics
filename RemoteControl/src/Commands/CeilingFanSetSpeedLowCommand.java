package Commands;

import Appliance.CeilingFan;

public class CeilingFanSetSpeedLowCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanSetSpeedLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.setSpeedLow();
    }

    @Override
    public void undo() {
        ceilingFan.undoSpeed();
    }
}
