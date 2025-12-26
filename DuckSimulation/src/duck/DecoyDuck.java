package duck;

import fly.FlyRocketPowered;
import quack.Squeak;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        this.flyBehaviour = new FlyRocketPowered();
        this.quackBehaviour = new Squeak();
    }

    public void display() {
        System.out.println("I am a decoy duck");
    }
}
