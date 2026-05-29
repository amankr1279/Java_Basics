package org.example.product;

public abstract class Product {
    String productId;
    ProductCategory category;
    int critical;

    public Product(String productId, ProductCategory category, int critical) {
        this.productId = productId;
        this.category = category;
        this.critical = critical;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

}
