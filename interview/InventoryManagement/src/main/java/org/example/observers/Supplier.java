package org.example.observers;

import org.example.product.Product;

public class Supplier implements Observer{
    String name;

    public Supplier(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getCategory().toString() + " Stock count is below critical level. need supplies");
    }
}
