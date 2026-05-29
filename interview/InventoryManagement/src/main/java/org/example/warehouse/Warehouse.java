package org.example.warehouse;

import org.example.observers.Observer;
import org.example.product.Product;
import org.example.product.ProductCategory;
import org.example.product.ProductFactory;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Warehouse implements Observable {
    public int capacity;
    public EnumMap<ProductCategory, Integer> stocks;
    public List<Product> products;
    public ProductFactory productFactory;
    public List<Observer> observers;

    public Warehouse(int capacity) {
        this.capacity = capacity;
        this.stocks = new EnumMap<>(ProductCategory.class);
        this.products = new ArrayList<>();
        this.productFactory = new ProductFactory();
        this.observers = new ArrayList<>();
    }

    public int getProductStockCount(ProductCategory category) {
        return stocks.getOrDefault(category, 0);
    }

    public boolean feasible(ProductCategory category, int quantity, String operation) {
        int currentStock = getProductStockCount(category);
        if (operation.toLowerCase().contains("add")) {
            return currentStock + quantity <= capacity;
        } else{
            return currentStock >= quantity;
        }
    }

    public void updateProduct(ProductCategory category, int quantity, String operation) {
        int currentStock = getProductStockCount(category);
        Product product = productFactory.getProduct(category);
        if (operation.contains("add")) {
            if (!stocks.containsKey(category)) {
                products.add(product);
            }
            quantity += currentStock;
            // Notify observes if even after addition the total stock count is below critical
            if (quantity <= product.getCritical()) {
                this.notifyObservers();
            }
        } else {
            quantity = currentStock - quantity;
            // Just when the product goes below critical from not critical, notify the observers
            if (currentStock <= product.getCritical()) {
                this.notifyObservers();
            }
        }
        stocks.put(category, quantity);
    }

    public int getTotalStock(){
        int count = 0;
        for (Map.Entry<ProductCategory, Integer> m: stocks.entrySet() ) {
            ProductCategory key = m.getKey();
            count += stocks.get(key);
        }

        return count;
    }


    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Add observer");
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Remove observer");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            for (Product product: products) {
                int currentStock = getProductStockCount(product.getCategory());
                if (currentStock <= product.getCritical()) {
                    observer.update(product);
                }
            }
        }

    }
}
