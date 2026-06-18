package api;

import Model.Customer;
import Model.IRoom;
import Model.Reservation;
import Service.CustomerService;
import Service.ReservationService;

import java.util.Collection;
import java.util.Date;

public class HotelResource {

    // Static references
    private static CustomerService customerService =
            new CustomerService();

    private static ReservationService reservationService =
            new ReservationService();

    // Get customer
    public Customer getCustomer(String email) {
        return customerService.getCustomer(email);
    }

    // Create customer
    public void createACustomer(String email,
                                String firstName,
                                String lastName) {

        customerService.addCustomer(
                email,
                firstName,
                lastName
        );
    }

    // Get room
    public IRoom getRoom(String roomNumber) {
        return reservationService.getARoom(roomNumber);
    }

    // Book room
    public Reservation bookARoom(String customerEmail,
                                 IRoom room,
                                 Date checkInDate,
                                 Date checkOutDate) {

        Customer customer =
                customerService.getCustomer(customerEmail);

        return reservationService.reserveARoom(
                customer,
                room,
                checkInDate,
                checkOutDate
        );
    }

    // Customer reservations
    public Collection<Reservation>
    getCustomersReservations(String customerEmail) {

        Customer customer =
                customerService.getCustomer(customerEmail);

        return reservationService
                .getCustomersReservation(customer);
    }

    // Find rooms
    public Collection<IRoom>
    findARoom(Date checkIn,
              Date checkOut) {

        return reservationService
                .findRooms(checkIn, checkOut);
    }
}