package org.example.p1;

public class Cat {
    private String name;

    @Override
    public String toString() {
        return("imie kota: "+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
