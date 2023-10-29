package com.engeto;

import java.util.ArrayList;
import java.util.List;

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


}
