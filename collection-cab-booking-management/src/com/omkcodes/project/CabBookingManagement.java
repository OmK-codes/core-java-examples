package com.omkcodes.project;

import com.omkcodes.project.model.Booking;
import com.omkcodes.project.model.Driver;
import com.omkcodes.project.model.Passenger;
import com.omkcodes.project.model.Vehicle;
import com.omkcodes.project.services.BookingService;
import com.omkcodes.project.services.DriverService;
import com.omkcodes.project.services.PassengerService;
import com.omkcodes.project.services.VehicleService;

import java.util.Scanner;

public class CabBookingManagement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        do {
            System.out.println("\n--- Cab Booking Management System ---");
            System.out.println("1. Create Passenger");
            System.out.println("2. Create Driver");
            System.out.println("3. Create Vehicle");
            System.out.println("4. Create Booking");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    PassengerService passengerService = new PassengerService();
                    Passenger passenger = passengerService.createNewPassenger();
                    System.out.println("Passenger created: " + passenger);
                    break;
                case 2:
                    DriverService driverService = new DriverService();
                    Driver driver = driverService.createNewDriver();
                    System.out.println("Driver created: " + driver);
                    break;
                case 3:
                    VehicleService vehicleService = new VehicleService();
                    Vehicle vehicle = vehicleService.createNewVehicle();
                    System.out.println("Vehicle created: " + vehicle);
                    break;
                case 4:
                    BookingService bookingService = new BookingService();
                    Booking booking = bookingService.createNewBooking();
                    System.out.println("Booking created: " + booking);
                    break;
                case 0:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (option != 0);
    }
}
