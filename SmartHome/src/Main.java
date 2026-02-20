public class Main {
    public static void main(String[] args) {
        System.out.println("Smart Home: Composite Design Pattern");
        /**
         * This pattern is used when we have hierarchical structure
         * In this case, home consists of rooms and rooms consist of devices.
         * This is the hierarchy.
         */
        AirConditioner airConditioner = new AirConditioner();
        TubeLight tubeLight = new TubeLight();

        CompositeComponent room1 = new CompositeComponent();
        room1.addComponent(airConditioner);
        room1.addComponent(tubeLight);

        CompositeComponent room2 = new CompositeComponent();
        room2.addComponent(airConditioner);

        CompositeComponent home = new CompositeComponent();
        home.addComponent(room1);
        home.addComponent(room2);

        home.turnOn();

        room1.turnOff();


    }
}