package org.example.p1;

public class Parrot {
    private String name;

    @Override
    public String toString() {
        return("imie papugi: "+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}