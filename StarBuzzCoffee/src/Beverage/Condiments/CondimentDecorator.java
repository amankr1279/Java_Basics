package Beverage.Condiments;

import Beverage.Coffee;

public abstract class CondimentDecorator extends Coffee {
    Coffee coffee;

    public SIZE getSize() {
        return coffee.getSize();
    }

    abstract public String getDescription() ;

    public double sizeFactor(SIZE size){
        if (size == SIZE.TALL){
            return 1.00;
        } else if (size == SIZE.GRANDE) {
            return 1.50;
        } else if (size == SIZE.VENTI) {
            return 2.00;
        }
        return 1.00;
    }
}
