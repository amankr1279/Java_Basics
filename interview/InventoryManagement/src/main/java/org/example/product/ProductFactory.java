package org.example.product;

import java.util.UUID;

public class ProductFactory {
    private static ProductFactory instance;

    public static ProductFactory getInstance() {
        if (instance == null){
            instance = new ProductFactory();
        }

        return instance;
    }

    public Product getProduct(ProductCategory category) {
        String id = UUID.randomUUID().toString();
        switch (category) {
            case FOOD -> {
                return new FoodProduct(id, category);
            }
            case ELECTRONICS -> {
                return new ElectronicsProduct(id, category);
            }
            case CLEANER -> {
                return new CleanerProduct(id, category);
            }
        }
        return new CrockeryProduct(id, category);
    }
}
