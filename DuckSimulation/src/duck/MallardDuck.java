package duck;

import fly.FlyBehaviour;
import fly.FlyWithWings;
import quack.Quack;
import quack.QuackBehaviour;

public class MallardDuck extends Duck{

    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I am a Mallard Duck");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

}
