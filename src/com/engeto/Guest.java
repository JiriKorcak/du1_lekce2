package com.engeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guest {
    private String jmeno;
    private int denNarozeni;
    private int mesicNatozeni;
    private int rokNarozeni;



    //region kontruktor

    public Guest(String jmeno, int denNarozeni, int mesicNatozeni, int rokNarozeni) {
        this.jmeno = jmeno;
        this.denNarozeni = denNarozeni;
        this.mesicNatozeni = mesicNatozeni;
        this.rokNarozeni = rokNarozeni;
    }


    //endregion

    //region gettery a settery


    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

       public int getDenNarozeni() {
        return denNarozeni;
    }

    public void setDenNarozeni(int denNarozeni) {
        this.denNarozeni = denNarozeni;
    }

    public int getMesicNatozeni() {
        return mesicNatozeni;
    }

    public void setMesicNatozeni(int mesicNatozeni) {
        this.mesicNatozeni = mesicNatozeni;
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }

    public void setRokNarozeni(int rokNarozeni) {
        this.rokNarozeni = rokNarozeni;
    }
//endregion
}
