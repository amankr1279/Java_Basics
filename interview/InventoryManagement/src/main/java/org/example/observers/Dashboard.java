package org.example.observers;

import org.example.product.Product;

public class Dashboard implements Observer{
    String name;

    public Dashboard(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getCategory().toString() + " Stock count is below critical level");
    }
}
