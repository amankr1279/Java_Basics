package org.example.parkingSpot;

public class BikeSpot implements ParkingSpot{
    private boolean occupied;
    private final String type;

    public BikeSpot() {
        this.type = "bike";
    }

    @Override
    public boolean isOccupied() {
        return occupied;
    }

    @Override
    public void occupy() {
        this.occupied = true;
    }

    @Override
    public void release() {
        this.occupied = false;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
