import com.engeto.Booking;
import com.engeto.Guest;
import com.engeto.Room;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla Malíková ",
                13, 3, 1993);

        Guest guest2 = new Guest("Jan Dvořáček ",
                 5, 5, 1995);

        Room room1 = new Room(1, 1,
                true, true, 1000);

        Room room2 = new Room(2, 1,
                true, true, 1000);

        Room room3 = new Room(3, 3,
                false, true, 2400);

        Booking booking1 = new Booking(guest1.getJmeno(), room1.getCisloPokoje(), 19,
                7, 2021, 26,
                7, 2021);

        Booking booking2 = new Booking(guest1.getJmeno()+", " +guest2.getJmeno(),
                room3.getCisloPokoje(), 1, 9, 2021,
                14,9,2021);

        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(booking1);
        bookingList.add(booking2);


        System.out.println("Počet rezervací: " + bookingList.size() + ".");
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);

        System.out.println(bookingList);







    }
}