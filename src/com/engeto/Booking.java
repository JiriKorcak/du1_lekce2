package com.engeto;

public class Booking {
    private String jménoHosta;
    private int cisloPokoje;
    private int denZahajeni;
    private int mesicZahajeni;
    private int rokZahajeni;
    private int denUkonceni;
    private int mesicUkonceni;
    private int rokUkonceni;


    //region konstruktor

    public Booking(String jménoHosta, int cisloPokoje, int denZahajeni,
                   int mesicZahajeni, int rokZahajeni, int denUkonceni,
                   int mesicUkonceni, int rokUkonceni) {
        this.jménoHosta = jménoHosta;
        this.cisloPokoje = cisloPokoje;
        this.denZahajeni = denZahajeni;
        this.mesicZahajeni = mesicZahajeni;
        this.rokZahajeni = rokZahajeni;
        this.denUkonceni = denUkonceni;
        this.mesicUkonceni = mesicUkonceni;
        this.rokUkonceni = rokUkonceni;
    }


    //endregion

    //region gettery a settery


    public String getJménoHosta() {
        return jménoHosta;
    }

    public void setJménoHosta(String jménoHosta) {
        this.jménoHosta = jménoHosta;
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getDenZahajeni() {
        return denZahajeni;
    }

    public void setDenZahajeni(int denZahajeni) {
        this.denZahajeni = denZahajeni;
    }

    public int getMesicZahajeni() {
        return mesicZahajeni;
    }

    public void setMesicZahajeni(int mesicZahajeni) {
        this.mesicZahajeni = mesicZahajeni;
    }

    public int getRokZahajeni() {
        return rokZahajeni;
    }

    public void setRokZahajeni(int rokZahajeni) {
        this.rokZahajeni = rokZahajeni;
    }

    public int getDenUkonceni() {
        return denUkonceni;
    }

    public void setDenUkonceni(int denUkonceni) {
        this.denUkonceni = denUkonceni;
    }

    public int getMesicUkonceni() {
        return mesicUkonceni;
    }

    public void setMesicUkonceni(int mesicUkonceni) {
        this.mesicUkonceni = mesicUkonceni;
    }

    public int getRokUkonceni() {
        return rokUkonceni;
    }

    public void setRokUkonceni(int rokUkonceni) {
        this.rokUkonceni = rokUkonceni;
    }
//endregion

    @Override
    public String toString() {
        return  "Host: " + jménoHosta + '\n' +
                " číslo pokoje: " + cisloPokoje + '\n' +
                " datum zahájení: " + denZahajeni +
                "." + mesicZahajeni +
                "." + rokZahajeni + '\n'+
                " datum ukončení: " + denUkonceni +
                "." + mesicUkonceni +
                "." + rokUkonceni + '\n';
    }
}
