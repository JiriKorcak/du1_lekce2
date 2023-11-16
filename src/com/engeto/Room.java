package com.engeto;

public class Room {

    private int numberOfRoom;
    private int numberOfBeds;
    private boolean isBalcony;
    private boolean isSea;
    private int priceOfRoom;

    //region konstruktory

    public Room(int numberOfRoom, int numberOfBeds, boolean isBalcony, boolean isSea, int priceOfRoom) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isSea = isSea;
        this.priceOfRoom = priceOfRoom;
    }
    //endregion

    //region gettery a settery

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        this.isBalcony = balcony;
    }

    public boolean isSea() {
        return isSea;
    }

    public void setSea(boolean sea) {
        this.isSea = sea;
    }

    public int getPriceOfRoom() {
        return priceOfRoom;
    }

    public void setPriceOfRoom(int priceOfRoom) {
        this.priceOfRoom = priceOfRoom;
    }
    //endregion

    public String printIsSea() {
        String answerSea = "Ne";
        if (isSea)
            answerSea = "Ano";
        return answerSea;
    }
    private String printIsBalcony() {
        String answerBalcony = "Ne";
        if (isBalcony)
            answerBalcony = "Ano";
        return answerBalcony;
    }


    @Override
    public String toString() {
        return  "Pokoj číslo: " + numberOfRoom +
                ", počet lůžek: " + numberOfBeds +
                ", balkón: " + printIsBalcony() +
                ", výhled na moře: " + printIsSea() +
                ", cena: " + priceOfRoom + " Kč/noc.";
    }
}
