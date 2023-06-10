package org.example.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DogTest {
    @Test
    public void test() {
        Dog dog = new Dog();
        assertNull(dog.getName());
        dog.setName("test");
        assertEquals("test", dog.getName());
    }
}
