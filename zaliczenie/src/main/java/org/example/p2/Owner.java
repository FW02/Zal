package org.example.p2;

import org.example.p1.Cat;
import org.example.p1.Parrot;
import org.example.p1.Dog;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private List<Dog> dogs = new ArrayList<>();
    private List<Cat> cats = new ArrayList<>();
    private List<Parrot> parrots = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }
    public List<Parrot> getParrots() {
        return parrots;
    }

    public void setParrots(List<Parrot> parrots) {
        this.parrots = parrots;
    }
    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void addParrot(Parrot parrot) {
        parrots.add(parrot);
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    @Override
    public String toString() {
        return "Posiadane psy: [" + dogs + "], posiadane koty: [" + cats + "], posiadane papugi: [" + parrots + "]";
    }
}
