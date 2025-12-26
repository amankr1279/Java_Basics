package Beverage.Coffees;

import Beverage.Coffee;

public class Decaf extends Coffee {
    public Decaf(){
        this.description = "Decaf is the best";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
