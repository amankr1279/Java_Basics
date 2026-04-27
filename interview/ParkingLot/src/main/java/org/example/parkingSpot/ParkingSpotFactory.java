package org.example.parkingSpot;

import org.example.vehicle.Vehicle;

public class ParkingSpotFactory {

    public ParkingSpotFactory() {
    }

    public ParkingSpot getParkingSpot(Vehicle vehicle) {
        if (vehicle.getType().contains("Car")) {
            return new CarSpot();
        } else if (vehicle.getType().contains("bike")) {
            return new BikeSpot();
        }
        return new TruckSpot();
    }
}
