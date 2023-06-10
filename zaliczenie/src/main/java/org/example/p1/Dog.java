package org.example.p1;

public class Dog {
    private String name;
    @Override
    public String toString() {
        return("imie psa: "+name);
    }

    /**
     * Pobranie imienia psa
     */
    public String getName() {
        return name;
    }

    /**
     * Ustawienie imienia psa
     * @param name imie psa
     */
    public void setName(String name) {
        this.name = name;
    }
}
