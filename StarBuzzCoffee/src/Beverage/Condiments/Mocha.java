package Beverage.Condiments;

import Beverage.Coffee;

public class Mocha extends CondimentDecorator {

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double condimentCost = 0.20 * sizeFactor(getSize());
        System.out.println("Mocha cost :" + condimentCost);
        return this.coffee.cost() + condimentCost;
    }
}
