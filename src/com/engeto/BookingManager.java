package com.engeto;

import java.text.DecimalFormat;
import java.util.List;

import static com.engeto.Booking.TypeOfStay.HOLIDAY;
import static com.engeto.Booking.TypeOfStay.WORK;

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
        List<Booking> getBookingList = bookingList;
        return getBookingList;
    }

    public void clearBookings(){
        bookingList.clear();
    }

    public int getNumberOfWorkingBookings(List<Booking> bookingList) {
        int counter = 0;
        for (Booking booking : bookingList) {
            if (booking.getTypeOfStay().equals(WORK)) counter++;
        }
            return counter;
    }

    public String getAverageGuest(List<Booking> bookingList) {
        double counterGuests = 0;
        for (Booking booking : bookingList) {
            counterGuests = booking.getNumberOfGuest() + counterGuests;
        }
        double averageGuest = counterGuests / bookingList.size();
        DecimalFormat averageGuestFormat = new DecimalFormat();
        averageGuestFormat.setMaximumFractionDigits(1);
        return averageGuestFormat.format(averageGuest);
    }

    public void printBookingList() {
        System.out.println(bookingList);
    }

    public void printHolidayBooking(int x){
        int i = 0;
            for(Booking booking : bookingList) {
                if (i == x) break;
                else if (booking.getTypeOfStay().equals(HOLIDAY)) {
                        System.out.println(booking);
                        i++;
                }
            }
        }




}
