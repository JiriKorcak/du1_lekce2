import com.engeto.Booking;
import com.engeto.BookingManager;
import com.engeto.Guest;
import com.engeto.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla Malíková ",
                LocalDate.of(1993,3,13));

        Guest guest2 = new Guest("Jan Dvořáček ",
                LocalDate.of(1995,5,5));

        Guest guest3 = new Guest("Tomáš Jedno ",
                LocalDate.of(2000,2,29));


        Room room1 = new Room(1, 1,
                true, true, 1000);

        Room room2 = new Room(2, 1,
                true, true, 1000);

        Room room3 = new Room(3, 3,
                false, true, 2400);

        List<Guest> guestBooking1 = new ArrayList<>();
        guestBooking1.add(guest1);

        List<Guest> guestBooking2 = new ArrayList<>();
        guestBooking2.add(guest1);
        guestBooking2.add(guest2);

        List<Guest> guestBooking3 = new ArrayList<>();
        guestBooking3.add(guest1);
        guestBooking3.add(guest3);

        Booking booking1 = new Booking(guestBooking1, room1,
                LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26), Booking.Recreation.HOLIDAY);

        Booking booking2 = new Booking(guestBooking2, room3,
                LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14), Booking.Recreation.WORK);

        Booking booking3 = new Booking(guestBooking3, room3,
                LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14), Booking.Recreation.HOLIDAY);




        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(booking1);
        bookingList.add(booking2);


        List<Room> roomList = new ArrayList<>();

        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        for(Room room : roomList){
            System.out.println(room);
        }

        System.out.println("Počet rezervací: " + bookingList.size() + ". \n" + bookingList);

        BookingManager bookingManager = new BookingManager(bookingList);

        bookingManager.addBooking(booking3);

      //  System.out.println("+++++++++++++ \n Počet rezervací: " + bookingList.size() + ". \n" + bookingList);
        // booking.get(0)







    }
}