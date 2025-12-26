package Beverage.Coffees;

import Beverage.Coffee;

public class HouseBlend extends Coffee {
    public HouseBlend () {
        this.description = "HOuse blend coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
