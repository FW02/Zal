package org.example.p1;

public class Cat {
    private String name;

    @Override
    public String toString() {
        return("imie kota: "+name);
    }

    /**
     * Pobranie imienia kota
     */
    public String getName() {
        return name;
    }

    /**
     * Ustawienie imienia kota
     * @param name imie kota
     */
    public void setName(String name) {
        this.name = name;
    }
}
