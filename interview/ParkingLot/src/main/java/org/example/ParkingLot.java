package org.example;

import org.example.parkingSpot.BikeSpot;
import org.example.parkingSpot.CarSpot;
import org.example.parkingSpot.ParkingSpot;
import org.example.parkingSpot.TruckSpot;
import org.example.payment.PaymentStrategy;
import org.example.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingSpot> parkingSpots;
    private static final ParkingLot parkingLot = new ParkingLot();

    private ParkingLot() {
        this.parkingSpots = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CarSpot spot = new CarSpot();
            parkingSpots.add(spot);
        }
        for (int i = 0; i < 10; i++) {
            BikeSpot spot = new BikeSpot();
            parkingSpots.add(spot);
        }
        for (int i = 0; i < 10; i++) {
            TruckSpot spot = new TruckSpot();
            parkingSpots.add(spot);
        }
    }

    public static ParkingLot getParkingLot() {
        return parkingLot;
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        String type = vehicle.getType().toLowerCase();

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
