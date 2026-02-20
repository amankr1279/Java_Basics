public class TubeLight implements SmartComponent{
    @Override
    public void turnOff() {
        System.out.println("Turn OFF TubeLight");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn ON TubeLight");
    }
}
