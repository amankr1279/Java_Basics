package Beverage.Condiments;

import Beverage.Coffee;

public class Soy extends CondimentDecorator {

    public Soy(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double condimentCost = 0.15 * sizeFactor(getSize());
        System.out.println("Soy cost :" + condimentCost);
        return this.coffee.cost() + condimentCost;
    }
}
