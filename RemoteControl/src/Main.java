import Appliance.CeilingFan;
import Appliance.Light;
import Appliance.Stereo;
import Commands.*;
import Controllers.ModernRemoteControl;
import Controllers.SimpleRemoteControl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Remote control to learn Command Design pattern");

        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light livingRoom = new Light("Living Room");
        Light kitchen = new Light("Kitchen");
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Study Room");

        NoCommand noCommand = new NoCommand();
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoom);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoom);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchen);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchen);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoSetVolume stereoSetVolume = new StereoSetVolume(stereo);
        StereoSetCDCommand stereoSetCDCommand = new StereoSetCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFanSetSpeedHighCommand fanSetSpeedHighCommand = new CeilingFanSetSpeedHighCommand(ceilingFan);
        CeilingFanSetSpeedMidCommand fanSetSpeedMidCommand = new CeilingFanSetSpeedMidCommand(ceilingFan);
        CeilingFanSetSpeedLowCommand fanSetSpeedLowCommand = new CeilingFanSetSpeedLowCommand(ceilingFan);
        CeilingFanTurnOffCommand fanTurnOffCommand = new CeilingFanTurnOffCommand(ceilingFan);

        remoteControl.setSlotCommand(livingRoomLightOn);
        remoteControl.onButtonPress();

        ModernRemoteControl modernRemoteControl = new ModernRemoteControl(10);
        modernRemoteControl.setCommands(0, livingRoomLightOn, livingRoomLightOff);
        modernRemoteControl.setCommands(1, kitchenLightOn, kitchenLightOff);
        modernRemoteControl.setCommands(2, stereoSetCDCommand, noCommand);
        modernRemoteControl.setCommands(3, stereoSetVolume, noCommand);
        modernRemoteControl.setCommands(4, stereoOnCommand, stereoOffCommand);
        modernRemoteControl.setCommands(5, fanSetSpeedHighCommand, fanSetSpeedHighCommand);
        modernRemoteControl.setCommands(6, fanSetSpeedLowCommand, fanSetSpeedLowCommand);
        modernRemoteControl.setCommands(7, fanTurnOffCommand, fanTurnOffCommand);
        modernRemoteControl.setCommands(8, fanSetSpeedMidCommand, fanSetSpeedMidCommand);

        modernRemoteControl.onButtonPress(0);
        modernRemoteControl.onButtonPress(2);
        modernRemoteControl.offButtonPress(0);
        modernRemoteControl.undoButtonPress();

        modernRemoteControl.onButtonPress(5);
        modernRemoteControl.onButtonPress(7);
        modernRemoteControl.undoButtonPress();
    }
}