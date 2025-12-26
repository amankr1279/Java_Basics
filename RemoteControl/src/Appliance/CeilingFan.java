package Appliance;

public class CeilingFan {
    String room;
    public static  int OFF = 0;
    public static  int LOW = 1;
    public static  int MID = 2;
    public static  int HIGH = 3;
    int speed = OFF;
    private int previousState = OFF;

    public CeilingFan(String room) {
        System.out.println("Ceiling fan is in " + room);
        this.room = room;
    }

    public void setSpeedHigh() {
        previousState = speed;
        this.speed = HIGH;
        System.out.println("Fan speed is set to HIGH");
    }

    public void setSpeedMid() {
        previousState = speed;
        this.speed = MID;
        System.out.println("Fan speed is set to MID");
    }

    public void setSpeedLow() {
        previousState = speed;
        this.speed = LOW;
        System.out.println("Fan speed is set to LOW");
    }

    public void turnOffFan() {
        previousState = speed;
        this.speed = OFF;
        System.out.println("Fan is turned off");
    }

    public void undoSpeed() {
        this.speed = previousState;
    }
}
