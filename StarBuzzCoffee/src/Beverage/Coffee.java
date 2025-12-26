package Beverage;

public abstract class Coffee {

    public enum SIZE {
        TALL,
        GRANDE,
        VENTI
    }

    public SIZE size = SIZE.TALL;
    public String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    public abstract double cost();
}
