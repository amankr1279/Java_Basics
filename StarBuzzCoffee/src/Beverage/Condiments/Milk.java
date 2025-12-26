package Beverage.Condiments;

import Beverage.Coffee;

public class Milk extends CondimentDecorator {

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        double condimentCost = 0.05 * sizeFactor(getSize());
        System.out.println("Milk cost :" + condimentCost);
        return this.coffee.cost() + condimentCost;
    }
}
