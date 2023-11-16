package com.engeto;

import java.time.LocalDate;

public class Guest {
    private String name;
    private LocalDate dateOfBirth;




    //region kontruktor

    public Guest(String jmeno, LocalDate dateOfBirth) {
        this.name = jmeno;
        this.dateOfBirth = dateOfBirth;
    }


    //endregion

    //region gettery a settery

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


//endregion


    @Override
    public String toString() {
        return "Jméno: " + name + " (" + dateOfBirth + ")";
    }
}
