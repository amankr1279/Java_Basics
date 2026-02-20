public class AirConditioner implements SmartComponent {

    @Override
    public void turnOff() {
        System.out.println("Turn OFF AC");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on AC");
    }
}
