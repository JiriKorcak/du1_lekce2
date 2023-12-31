import com.engeto.Booking;
import com.engeto.BookingManager;
import com.engeto.Guest;
import com.engeto.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.engeto.Booking.TypeOfStay.WORK;


public class Main {

    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla Malíková ",
                LocalDate.of(1993, 3, 13));

        Guest guest2 = new Guest("Jan Dvořáček ",
                LocalDate.of(1995, 5, 5));

        Guest guest3 = new Guest("Tomáš Jedno ",
                LocalDate.of(2000, 2, 29));


        Room room1 = new Room(1, 1,
                true, true, 1000);

        Room room2 = new Room(2, 1,
                true, true, 1000);

        Room room3 = new Room(3, 3,
                false, true, 2400);


        Booking booking1 = new Booking(List.of(guest1), room1,
                LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), Booking.TypeOfStay.HOLIDAY);

        Booking booking2 = new Booking(List.of(guest1, guest2), room3,
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), WORK);

        Booking booking3 = new Booking(List.of(guest1, guest3), room3,
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), WORK);


        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(booking1);
        bookingList.add(booking2);


        List<Room> roomList = new ArrayList<>();

        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        for (Room room : roomList) {
            System.out.println(room);
        }

        BookingManager bookingManager = new BookingManager(bookingList);

        bookingManager.addBooking(booking3);


        for (Booking booking : bookingList) {
            System.out.println("--------------- \n Objednávka č." + booking.getId() + "\n" +
                    "Hosté: " + booking.getGuests() + "\n pokoj č." + booking.getBookingRoom().getNumberOfRoom() +
                    " Od " + booking.getBookingFrom() + " do " + booking.getBookingTo());
        }


//        System.out.println(bookingManager.getBooking(2));
//        bookingManager.clearBookings();
//        System.out.println(bookingList);





        Guest guest4 = new Guest("Karel Dvořák",
                LocalDate.of(1990, 5, 15));

        Guest guest5 = new Guest("Karel Dvořák",
                LocalDate.of(1979, 1, 3));

        Guest guest6 = new Guest("Karolína Tmavá",
                LocalDate.of(2000, 2, 29));

        Booking booking4 = new Booking(List.of(guest4), room3,
                LocalDate.of(2023,6,1),
                LocalDate.of(2023,6,7), WORK);

        Booking booking5 = new Booking(List.of(guest5), room2,
                LocalDate.of(2023,7,18),
                LocalDate.of(2023,7,21), Booking.TypeOfStay.HOLIDAY);

        bookingList.add(booking4);
        bookingList.add(booking5);



        LocalDate bookingDate = LocalDate.of(2023,8,1);
        for (int i = 0; i < 10; i++) {
            bookingList.add(new Booking(List.of(guest6), room2,
                    bookingDate, bookingDate.plusDays(1), WORK));
            bookingDate = bookingDate.plusDays(2);
        }



        Booking booking16 = new Booking(List.of(guest6), room2,
                LocalDate.of(2023,8,1),
                LocalDate.of(2023,8,31), Booking.TypeOfStay.HOLIDAY);

        bookingList.add(booking16);

        System.out.println("\n Počet pracovních rekreací: " + bookingManager.getNumberOfWorkingBookings(bookingList) + ".");

        System.out.println("\n Průměrný počet hostů na rezervaci: " + bookingManager.getAverageGuest(bookingList) + "." );

        bookingManager.printHolidayBooking(8);

        printGuestStatistics(bookingList);
//
//        System.out.println(booking2.getBookingLength());
//
//        booking2.printBookingLength();
//
//        System.out.println(booking2.getPrice());
//
//        booking2.printPrice();
    printBookingList(bookingList);



    }
    public static void printBookingList(List<Booking>bookingList) {
        System.out.println(bookingList);
    }
    public static void printGuestStatistics(List<Booking> bookingList) {
        int oneGuestStats = 0;
        int twoGuestStats = 0;
        int moreGuestsStats = 0;
        for (Booking booking : bookingList) {
            if (booking.getNumberOfGuest() < 2) oneGuestStats++;
            else if (booking.getNumberOfGuest() == 2) twoGuestStats++;
            else if (booking.getNumberOfGuest() > 2) moreGuestsStats++;
        }
        System.out.println("+++++++++\n Rezervací s jedním hostem: " + oneGuestStats +
                "\n Rezervací se dvěma hosty: " + twoGuestStats +
                "\n Rezervací s třemi a více hosty: " + moreGuestsStats);
    }
}
