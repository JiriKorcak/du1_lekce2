package com.engeto;

import java.time.LocalDate;

import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Booking {
    private static int nextId = 1;
    private int id = nextId++;
    private List<Guest> guests;
    private Room bookingRoom;
    private LocalDate bookingFrom;
    private LocalDate bookingTo;
    private TypeOfStay typeOfStay;

    public enum TypeOfStay {
        WORK,
        HOLIDAY
    }



    //region konstruktor


    public Booking(List<Guest> guests, Room bookingRoom, LocalDate bookingFrom, LocalDate bookingTo, TypeOfStay typeOfStay) {
        this.guests = guests;
        this.bookingRoom = bookingRoom;
        this.bookingFrom = bookingFrom;
        this.bookingTo = bookingTo;
        this.typeOfStay = typeOfStay;

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

    public TypeOfStay getTypeOfStay() {
        return typeOfStay;
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

    public void setRecreation(TypeOfStay typeOfStay) {
        this.typeOfStay = typeOfStay;
    }

    //endregion
    private String isWork() {
        String printIsWork = "Pracovní";
        if (typeOfStay.equals(TypeOfStay.HOLIDAY))
            printIsWork = "Rekreační";
        return printIsWork;

    }

    public long getBookingLength() {
        long daysBetween = DAYS.between(bookingFrom, bookingTo);
        daysBetween++;
        return daysBetween;
            }

    public void printBookingLength() {
        System.out.println ("Délka rezervace č." + id + " je " + getBookingLength() + " dnů.");
            }
    public long getPrice() {
        long daysBetween = getBookingLength();
        return daysBetween * bookingRoom.getPriceOfRoom();
    }

    public void printPrice() {
        System.out.println ("Cena rezervace č." + id + " je " + getPrice() + ",-Kč.");
    }
    @Override
    public String toString() {
        return  "--------------- \n" + bookingFrom + " až " + bookingTo + ": " +
                getFirstGuest() + '[' + printGuestsSize()+ ", " + bookingRoom.printIsSea() +']' +
                " za: " + bookingRoom.getPriceOfRoom() + ". \n";
    }
}
