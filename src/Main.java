import com.engeto.Booking;
import com.engeto.Guest;
import com.engeto.Room;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla Malíková ",
                LocalDate.of(1993,3,13));

        Guest guest2 = new Guest("Jan Dvořáček ",
                LocalDate.of(1995,5,5));


        Room room1 = new Room(1, 1,
                true, true, 1000);

        Room room2 = new Room(2, 1,
                true, true, 1000);

        Room room3 = new Room(3, 3,
                false, true, 2400);


        Booking booking1 = new Booking(guest1, (List<Guest>) guest1, room1,
                LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26));

        Booking booking2 = new Booking(guest1, otherGuest.add(guest2), room3,
                LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14));




        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(booking1);
        bookingList.add(booking2);

        List<Room> roomList = new ArrayList<>();

        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);


        System.out.println("Počet rezervací: " + bookingList.size() + ". \n" + bookingList);










    }
}