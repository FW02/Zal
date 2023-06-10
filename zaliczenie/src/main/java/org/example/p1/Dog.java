package org.example.p1;

public class Dog {
    private String name;
    @Override
    public String toString() {
        return("imie psa: "+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
