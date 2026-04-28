package org.example.vehicle;

public abstract class Vehicle {
    private String type;
    private final String licenseNumber;

    public Vehicle(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}
