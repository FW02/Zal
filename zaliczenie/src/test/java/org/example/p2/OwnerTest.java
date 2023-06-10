package org.example.p2;

import org.example.p1.Cat;
import org.example.p1.Parrot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OwnerTest {
    @Test
    public void test(){
        Owner owner = new Owner();
        assertEquals(0,owner.getCats().size());
        assertEquals(0,owner.getDogs().size());
        assertEquals(0,owner.getParrots().size());

        Cat cat = new Cat();
        Parrot parrot = new Parrot();
        owner.addParrot(parrot);
        owner.addCat(cat);

        assertEquals(1,owner.getCats().size());
        assertEquals(0,owner.getDogs().size());
        assertEquals(1,owner.getParrots().size());
    }
}
