package org.example.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ParrotTest {
    @Test
    public void test() {
        Parrot parrot = new Parrot();
        assertNull(parrot.getName());
        parrot.setName("test");
        assertEquals("test", parrot.getName());
    }
}
