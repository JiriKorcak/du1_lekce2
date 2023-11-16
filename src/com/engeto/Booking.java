package com.engeto;

import java.time.LocalDate;

import java.util.List;

public class Booking {
    private static int nextId = 1;
    private int id = nextId++;
    private List<Guest> guests;
    private Room bookingRoom;
    private LocalDate bookingFrom;
    private LocalDate bookingTo;
    private Recreation recreation;

    public enum Recreation{
        WORK,
        HOLIDAY
    }



    //region konstruktor


    public Booking(List<Guest> guests, Room bookingRoom, LocalDate bookingFrom, LocalDate bookingTo, Recreation recreation) {
        this.guests = guests;
        this.bookingRoom = bookingRoom;
        this.bookingFrom = bookingFrom;
        this.bookingTo = bookingTo;
        this.recreation = recreation;

    }

//endregion

    //region gettery a settery


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

    public List<Guest> getGuests() {
        return guests;
    }


    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public int getId() {
        return id;
    }

    public Recreation getRecreation() {
        return recreation;
    }
    public int getNumberOfGuest(){
        return guests.size();
    }
    public Guest getFirstGuest(){
        return guests.get(0);
    }
    private int printGuestsSize(){
        return guests.size();
    }

    public void setRecreation(Recreation recreation) {
        this.recreation = recreation;
    }

    //endregion
    private String isWork() {
        String printIsWork = "Pracovní";
        if (recreation == Recreation.HOLIDAY)
            printIsWork = "Rekreační";
        return printIsWork;

    }

    @Override
    public String toString() {
        return  "--------------- \n" + bookingFrom + " až " + bookingTo + ": " +
                getFirstGuest() + '[' + printGuestsSize()+ ", " + bookingRoom.printIsSea() +']' +
                " za: " + bookingRoom.getPriceOfRoom() + ". \n";
    }
}
