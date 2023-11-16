package com.engeto;

import java.text.DecimalFormat;
import java.util.List;

import static com.engeto.Booking.Recreation.HOLIDAY;
import static com.engeto.Booking.Recreation.WORK;

public class BookingManager {

    private List<Booking> bookingList;

    //region constructor

    public BookingManager(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }
    //endregion


    public void addBooking(Booking newBooking) {
        this.bookingList.add(newBooking);
    }

    public Booking getBooking(int index) {
        return bookingList.get(index);
    }

    public List<Booking> getBookings(){
        return bookingList;
    }

    public void clearBookings(){
        bookingList.clear();
    }

    public static void getNumberOfWorkingBookings(List<Booking> bookingList) {
        int counter = 0;
        for (Booking booking : bookingList) {
            if (booking.getRecreation() == WORK) counter++;
        }
        System.out.println("\n Počet pracovních rekreací: " + counter + ".");

    }

    public static void getAverageGuest(List<Booking> bookingList) {
        double counterGuests = 0;
        for (Booking booking : bookingList) {
            counterGuests = booking.getNumberOfGuest() + counterGuests;
        }
        double averageGuest = counterGuests / bookingList.size();
        DecimalFormat averageGuestFormat = new DecimalFormat();
        averageGuestFormat.setMaximumFractionDigits(1);
        System.out.println("\n Průměrný počet hostů na rezervaci: " + averageGuestFormat.format(averageGuest) + "." );
    }




}
