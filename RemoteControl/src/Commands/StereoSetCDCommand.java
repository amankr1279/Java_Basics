package Commands;

import Appliance.Stereo;

public class StereoSetCDCommand implements Command{
    Stereo stereo;

    public StereoSetCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
    }

    @Override
    public void undo() {}
}
