package org.example;

import org.example.observers.Dashboard;
import org.example.observers.Supplier;
import org.example.product.ProductCategory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inventory Management System");
        /**
         * Inventory Management System
         * Inventory has warehouses which store products
         * Warehouse has a capacity and can do:- add/subtract products, add/remove observers, return total stock count
         * Inventory can :- add warehouse, move products b/w warehouses, generate status, notify suppliers
         * Product has id, category and critical stock count.
         * Observers are Suppliers or Main Dashboard
         *
         * Designs:- Observer, Factory 
         */

        InventoryManager inventoryManager = new InventoryManager();

        inventoryManager.addProduct(1, ProductCategory.FOOD, 40);
        inventoryManager.addProduct(1, ProductCategory.ELECTRONICS, 40);
        inventoryManager.addProduct(2, ProductCategory.CLEANER, 40);
        inventoryManager.addProduct(2, ProductCategory.CROCKERY, 30);

        inventoryManager.getStatus();

        inventoryManager.moveProduct(1, 2, ProductCategory.FOOD, 20);
        inventoryManager.moveProduct(2, 1, ProductCategory.CROCKERY, 40);

        inventoryManager.getStatus();

        Dashboard dashboard = new Dashboard("HQ");
        Supplier supplier = new Supplier("Dettol");

        inventoryManager.moveProduct(2, 1, ProductCategory.CLEANER, 35);
        inventoryManager.addObserver(1, dashboard);
        inventoryManager.addObserver(2, dashboard);
        inventoryManager.addObserver(1, supplier);
        inventoryManager.addObserver(2, supplier);

        inventoryManager.getStatus();

    }
}