package Commands;

import Appliance.CeilingFan;

public class CeilingFanSetSpeedMidCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanSetSpeedMidCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.setSpeedMid();
    }

    @Override
    public void undo() {
        ceilingFan.undoSpeed();
    }
}
