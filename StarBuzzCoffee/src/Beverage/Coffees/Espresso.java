package Beverage.Coffees;

import Beverage.Coffee;

public class Espresso extends Coffee {
    public Espresso() {
        this.description = "Espresso is very popular";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
