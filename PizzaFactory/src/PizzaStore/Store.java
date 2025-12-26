package PizzaStore;

import Pizza.Pizza;

public abstract class Store {
    Pizza pizza;

    /**
     * Observe that we have decoupled pizza ordering
     * We don't care what store it is, we can order pizza easily
    * */
    public Pizza orderPizza(String type) {
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
