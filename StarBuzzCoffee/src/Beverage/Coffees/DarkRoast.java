package Beverage.Coffees;

import Beverage.Coffee;

public class DarkRoast extends Coffee {

    public DarkRoast() {
        this.description = "Most excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
