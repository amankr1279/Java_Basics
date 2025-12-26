package PizzaFactory;

import Pizza.*;

public class SimplePizzaFactory {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    private static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type == "cheese") {
            pizza = new CheesePizza();
        } else if (type == "greek") {
            pizza = new GreekPizza();
        } else {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }

}
