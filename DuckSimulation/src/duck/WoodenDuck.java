package duck;

import fly.FlyNoWay;
import quack.Mute;

public class WoodenDuck extends Duck{

    public WoodenDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Mute();
    }

    public void display() {
        System.out.println("I am a Wooden Duck");
    }
}
