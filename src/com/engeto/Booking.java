package com.engeto;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private static int nextId = 1;
    private int id = nextId++;
    private Guest bookingGuest;
    private List<Guest> otherGuest;
    private Room bookingRoom;
    private LocalDate bookingFrom;
    private LocalDate bookingTo;



    //region konstruktor


    public Booking(Guest bookingGuest, List<Guest> otherGuest, Room bookingRoom, LocalDate bookingFrom, LocalDate bookingTo) {
        this.bookingGuest = bookingGuest;
        this.otherGuest = otherGuest;
        this.bookingRoom = bookingRoom;
        this.bookingFrom = bookingFrom;
        this.bookingTo = bookingTo;

    }

//endregion

    //region gettery a settery

    public Guest getBookingGuest() {
        return bookingGuest;
    }

    public void setBookingGuest(Guest bookingGuest) {
        this.bookingGuest = bookingGuest;
    }

    public Room getBookingRoom() {
        return bookingRoom;
    }

    public void setBookingRoom(Room bookingRoom) {
        this.bookingRoom = bookingRoom;
    }

    public LocalDate getBookingFrom() {
        return bookingFrom;
    }

    public void setBookingFrom(LocalDate bookingFrom) {
        this.bookingFrom = bookingFrom;
    }

    public LocalDate getBookingTo() {
        return bookingTo;
    }

    public void setBookingTo(LocalDate bookingTo) {
        this.bookingTo = bookingTo;
    }

    public void setId(int id) {
        this.id = id;
    }
    //endregion


    @Override
    public String toString() {
        return "Booking{" +
                "Rezervace č." + id + " Host: " + bookingGuest +
                "\n" + bookingRoom +
                ", Datum od: " + bookingFrom +
                ", Datum do: " + bookingTo +
                '}';
    }
}
