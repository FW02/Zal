package org.example.p1;

public class Parrot {
    private String name;

    @Override
    public String toString() {
        return("imie papugi: "+name);
    }

    /**
     * Pobranie imienia papugi
     */
    public String getName() {
        return name;
    }

    /**
     * Ustawienie imienia papugi
     * @param name imie papugi
     */
    public void setName(String name) {
        this.name = name;
    }
}