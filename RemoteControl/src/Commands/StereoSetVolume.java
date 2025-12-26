package Commands;

import Appliance.Stereo;

public class StereoSetVolume implements Command{
    Stereo stereo;

    public StereoSetVolume(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setVolume(10);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
    }

}
