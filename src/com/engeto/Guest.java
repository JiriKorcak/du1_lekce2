package com.engeto;

import java.time.LocalDate;

public class Guest {
    private String name;
    private LocalDate datumNarozeni;




    //region kontruktor

    public Guest(String jmeno, LocalDate datumNarozeni) {
        this.name = jmeno;
        this.datumNarozeni = datumNarozeni;
    }


    //endregion

    //region gettery a settery

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }


//endregion


    @Override
    public String toString() {
        return "Guest{" +
                "Jméno: " + name + '\'' +
                ", datum narození: " + datumNarozeni +
                '}';
    }
}
