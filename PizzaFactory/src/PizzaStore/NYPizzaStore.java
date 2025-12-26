package PizzaStore;

import Pizza.*;

public class NYPizzaStore extends Store{

    public NYPizzaStore() {
        System.out.println("This is NY Pizza store");
    }

    @Override
    Pizza createPizza(String type) {
        System.out.println("We keep thin crusts, tasty sauce and just a little cheese");
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
