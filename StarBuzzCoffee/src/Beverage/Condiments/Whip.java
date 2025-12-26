package Beverage.Condiments;

import Beverage.Coffee;

public class Whip extends CondimentDecorator {

    public Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double condimentCost = 0.10 * sizeFactor(getSize());
        System.out.println("Whip cost :" + condimentCost);
        return this.coffee.cost() + condimentCost;
    }
}
