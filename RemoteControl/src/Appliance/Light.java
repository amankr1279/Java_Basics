package Appliance;

public class Light {
    String room;
    public Light(String room) {
        System.out.println("Light bulbs");
        this.room = room;
    }

    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}
