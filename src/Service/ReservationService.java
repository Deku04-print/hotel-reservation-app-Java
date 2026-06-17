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

    // Static references
    private static Map<String, IRoom> rooms = new HashMap<>();
    private static Collection<Reservation> reservations = new ArrayList<>();

    public void addRoom(IRoom room){
        rooms.put(room.getRoomNumber(), room);
    }

    public IRoom getARoom(String roomID){
        return rooms.get(roomID);
    }

    public Reservation reserveARoom(Customer customer,
                                    IRoom room,
                                    Date checkInDate,
                                    Date checkOutDate){

        Reservation reservation = new Reservation(
                customer,
                room,
                checkInDate,
                checkOutDate
        );

        reservations.add(reservation);

        return reservation;
    }
}