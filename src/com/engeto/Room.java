package com.engeto;

public class Room {

    private int cisloPokoje;
    private int pocetLuzek;
    private boolean jeBalkon;
    private boolean jeMore;
    private int cenaPokoje;

    //region konstruktory

    public Room(int cisloPokoje, int pocetLuzek, boolean jeBalkon, boolean jeMore, int cenaPokoje) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.jeBalkon = jeBalkon;
        this.jeMore = jeMore;
        this.cenaPokoje = cenaPokoje;
    }
    //endregion

    //region gettery a settery

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public boolean isJeBalkon() {
        return jeBalkon;
    }

    public void setJeBalkon(boolean jeBalkon) {
        this.jeBalkon = jeBalkon;
    }

    public boolean isJeMore() {
        return jeMore;
    }

    public void setJeMore(boolean jeMore) {
        this.jeMore = jeMore;
    }

    public int getCenaPokoje() {
        return cenaPokoje;
    }

    public void setCenaPokoje(int cenaPokoje) {
        this.cenaPokoje = cenaPokoje;
    }
    //endregion
}
