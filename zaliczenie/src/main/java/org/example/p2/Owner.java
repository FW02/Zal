package org.example.p2;

import org.example.p1.Cat;
import org.example.p1.Parrot;
import org.example.p1.Dog;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private final List<Dog> dogs = new ArrayList<>();
    private final List<Cat> cats = new ArrayList<>();
    private final List<Parrot> parrots = new ArrayList<>();

    /**
     * Lista posiadanych przez właściciela psów
     * @return lista posiadanych psów
     */
    public List<Dog> getDogs() {
        return dogs;
    }

    /**
     * Lista posiadanych przez właściciela papug
     * @return lista posiadanych papug
     */
    public List<Parrot> getParrots() {
        return parrots;
    }

    /**
     * Lista posiadanych przez właściciela kotów
     * @return lista posiadanych kotów
     */
    public List<Cat> getCats() {
        return cats;
    }


    /**
     * Przypisanie psa właścicielowi
     * @param dog pies do przypisania
     */
    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    /**
     * Przypisanie papugi właścicielowi
     * @param parrot papuga do przypisania
     */
    public void addParrot(Parrot parrot) {
        parrots.add(parrot);
    }

    /**
     * Przypisanie kota właścicielowi
     * @param cat kot do przypisania
     */
    public void addCat(Cat cat) {
        cats.add(cat);
    }

    @Override
    public String toString() {
        return "Posiadane psy: [" + dogs + "], posiadane koty: [" + cats + "], posiadane papugi: [" + parrots + "]";
    }
}
