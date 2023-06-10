package org.example.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CatTest {
    @Test
    public void test(){
        Cat cat = new Cat();
        assertNull(cat.getName());
        cat.setName("test");
        assertEquals("test",cat.getName());
    }
}
