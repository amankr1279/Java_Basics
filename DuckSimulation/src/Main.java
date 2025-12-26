import duck.DecoyDuck;
import duck.MallardDuck;
import duck.WoodenDuck;
import fly.FlyRocketPowered;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ducks are flying");

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        mallardDuck.setFlyBehaviour(new FlyRocketPowered());
        mallardDuck.performFly();
    }
}