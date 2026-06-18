package api;

import Model.Customer;
import Model.IRoom;
import Service.CustomerService;
import Service.ReservationService;

import java.util.Collection;
import java.util.List;

public class AdminResource {

    // Static references
    private static CustomerService customerService =
            new CustomerService();

    private static ReservationService reservationService =
            new ReservationService();

    // Get customer
    public Customer getCustomer(String email) {
        return customerService.getCustomer(email);
    }

    // Add multiple rooms
    public void addRoom(List<IRoom> rooms) {

        for (IRoom room : rooms) {
            reservationService.addRoom(room);
        }
    }

    // Get all rooms
    public Collection<IRoom> getAllRooms() {
        return reservationService.getAllRooms();
    }

    // Get all customers
    public Collection<Customer> getAllCustomers() {
        return customerService.getAllCustomer();
    }

    // Display all reservations
    public void displayAllReservations() {
        reservationService.printAllReservation();
    }
}