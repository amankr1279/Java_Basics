import Beverage.Coffee;
import Beverage.Coffees.DarkRoast;
import Beverage.Coffees.Decaf;
import Beverage.Coffees.Espresso;
import Beverage.Condiments.Milk;
import Beverage.Condiments.Mocha;
import Beverage.Condiments.Soy;
import Beverage.Condiments.Whip;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to StarBuzz Coffee");

        Coffee coffee1 = new Espresso();
        System.out.println(coffee1.getDescription() + " and cost is $" + coffee1.cost());

        Coffee coffee2 = new DarkRoast();
        System.out.println(coffee2.getDescription() + " and cost is $" + coffee2.cost());
        coffee2 = new Mocha(coffee2);
        coffee2 = new Milk(coffee2);
        coffee2 = new Whip(coffee2);

        System.out.println(coffee2.getDescription() + " and cost is $" + coffee2.cost());

        System.out.println("************************");
        Coffee coffee3 = new Decaf();
        coffee3.setSize(Coffee.SIZE.VENTI);
        System.out.println(coffee3.getDescription() + " and size is " + coffee3.getSize());
        coffee3 = new Soy(coffee3);
        // coffee3.setSize(Coffee.SIZE.VENTI);
        System.out.println(coffee3.getDescription() + " and size is " + coffee3.getSize());
        coffee3 = new Milk(coffee3);
        System.out.println(coffee3.getDescription() + " and size is " + coffee3.getSize());

        System.out.println(coffee3.getDescription() + " and cost is $" + coffee3.cost());
    }
}