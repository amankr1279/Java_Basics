package org.example;

import org.example.parkingSpot.CarSpot;
import org.example.parkingSpot.ParkingSpot;
import org.example.payment.PaymentStrategy;
import org.example.vehicle.Bike;
import org.example.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingSpot> parkingSpots;
    private final ParkingLot parkingLot = new ParkingLot();

    private ParkingLot() {
        this.parkingSpots = new ArrayList<>();
    }

    public ParkingLot getParkingLot() {
        return this.parkingLot;
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        String type = vehicle.getType();

        for (ParkingSpot spot: parkingSpots) {
            if (!spot.isOccupied() && spot.getType().contains(type)) {
                return spot;
            }
        }
        return null;
    }

    public void parkCar(ParkingSpot spot) {
        if (!spot.isOccupied()) {
            spot.occupy();
        }
    }

    public void vacate(ParkingSpot spot, PaymentStrategy paymentStrategy) {
        if (spot.isOccupied()) {
            paymentStrategy.pay();
            spot.release();
        }
    }
}
