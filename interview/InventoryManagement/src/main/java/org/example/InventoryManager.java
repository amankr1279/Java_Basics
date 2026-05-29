package org.example;

import org.example.observers.Observer;
import org.example.product.ProductCategory;
import org.example.warehouse.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    public List<Warehouse> warehouseList;

    public InventoryManager() {
        warehouseList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            warehouseList.add(new Warehouse(100));
        }
    }

    public void addWarehouse(int capacity) {
        warehouseList.add(new Warehouse(capacity));
    }

    public void moveProduct(int id1, int id2, ProductCategory category, int quantity) {
        // move product from WH1 to WH2
        Warehouse warehouse1, warehouse2;
        warehouse1 = warehouseList.get(id1);
        warehouse2 = warehouseList.get(id2);
        if (warehouse1.feasible(category, quantity, "subtract") && warehouse2.feasible(category, quantity, "add")) {
            warehouse1.updateProduct(category, quantity, "subtract");
            warehouse2.updateProduct(category, quantity, "add");
            System.out.println("Moved products from " + id1 + "to" + id2);
        } else {
            System.out.println("This operation cannot be done");
        }
    }

    public void addProduct(int id, ProductCategory category, int quantity) {
        Warehouse warehouse = warehouseList.get(id);
        if (warehouse.feasible(category, quantity, "add")) {
            warehouse.updateProduct(category, quantity, "add");
        } else {
            System.out.println("This operation cannot be done");
        }
    }

    public void getStatus() {
        for (int i = 0; i < warehouseList.size(); i++) {
            Warehouse warehouse = warehouseList.get(i);
            warehouse.notifyObservers();
            System.out.println("Warehouse" + i + " has total stocks:" + warehouse.getTotalStock());

        }
    }

    public void addObserver(int id, Observer observer) {
        Warehouse warehouse = warehouseList.get(id);
        warehouse.registerObserver(observer);
    }


}
