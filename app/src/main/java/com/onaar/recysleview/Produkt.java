package com.onaar.recysleview;

public class Produkt {
    private String nazwa;
    private boolean czyKupiony;
    private double cena;

    public Produkt(double cena, String nazwa) {
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isCzyKupiony() {
        return czyKupiony;
    }

    public void setCzyKupiony(boolean czyKupiony) {
        this.czyKupiony = czyKupiony;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
