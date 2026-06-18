package Service;

import Model.Customer;
import Model.IRoom;
import Model.Reservation;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReservationService {

    // Static references to store rooms and reservations
    private static Map<String, IRoom> rooms = new HashMap<>();
    private static Collection<Reservation> reservations = new ArrayList<>();

    // Add a room
    public void addRoom(IRoom room) {
        rooms.put(room.getRoomNumber(), room);
    }

    // Get a room by its ID/number
    public IRoom getARoom(String roomID) {
        return rooms.get(roomID);
    }

    // Reserve a room for a customer during specific dates
    public Reservation reserveARoom(Customer customer,
                                    IRoom room,
                                    Date checkInDate,
                                    Date checkOutDate) {

        Reservation reservation = new Reservation(
                customer,
                room,
                checkInDate,
                checkOutDate
        );

        reservations.add(reservation);
        return reservation;
    }

    // Find available rooms between dates
    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        // In a real-world scenario, you'd filter rooms based on availability
        // Here, we assume all rooms are available for simplicity
        return rooms.values();
    }

    // Get all reservations for a specific customer
    public Collection<Reservation> getCustomersReservation(Customer customer) {
        Collection<Reservation> customerReservations = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getCustomer().equals(customer)) {
                customerReservations.add(reservation);
            }
        }
        return customerReservations;
    }

    public Collection<IRoom> getAllRooms() {
        return rooms.values();
    }

    public void printAllReservation() {

        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}