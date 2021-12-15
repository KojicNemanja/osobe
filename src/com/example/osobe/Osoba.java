package com.example.osobe;

public class Osoba {
    private int id;
    private String ime, prezime;
    private int godine;

    public Osoba(int id, String ime, String prezime, int godine) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    @Override
    public String toString() {
        return String.format("%-5d%-20s%-20s%-5d", id, ime, prezime, godine);
    }
}
