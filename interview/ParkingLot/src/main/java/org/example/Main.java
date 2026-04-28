package org.example;

import org.example.parkingSpot.ParkingSpot;
import org.example.payment.CashPayment;
import org.example.payment.CreditCard;
import org.example.vehicle.Bike;
import org.example.vehicle.Car;
import org.example.vehicle.Truck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Parking Lot Design
         *
         * Functional Requirements:-
         * Park vehicles
         * Space management
         * Payment collection
         *
         * Entities:- Vehicles, Parking Spot, Fare, Payment
         *
         * Vehicle --> Factory
         * Parking Spot --> Factory
         * Parking Lot --> Singleton (not necessary)
         * Tickets --> Strategy --> For different kinds of vehicles and fares
         * Payment --> Strategy --> for different types of payment modes
         *
         */

        ParkingLot parkingLot = ParkingLot.getParkingLot();

        Bike bike = new Bike("2");
        Truck truck = new Truck("3");

        for (int i = 1; i <= 12; i++) {
            Car car = new Car(String.valueOf(i));
            System.out.println(car.getType());
            ParkingSpot spot = parkingLot.findParkingSpot(car);
            if (spot != null) {
                parkingLot.parkCar(spot);
                if (i % 7 == 0) {
                    parkingLot.vacate(spot, new CashPayment());
                }
                if (i % 10 == 0) {
                    parkingLot.vacate(spot, new CreditCard());
                }
            } else {
                System.out.println("Could not find spot for car" + i);
            }
        }

        ParkingSpot bikeSpot = parkingLot.findParkingSpot(bike);
        parkingLot.parkCar(bikeSpot);
        ParkingSpot truckSpot = parkingLot.findParkingSpot(truck);
        parkingLot.parkCar(truckSpot);
    }
}