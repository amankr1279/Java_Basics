package org.example.parkingSpot;

public interface ParkingSpot {
    boolean isOccupied();
    void occupy();
    void release();
    String getType();
}
