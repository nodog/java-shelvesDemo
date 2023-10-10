package net.konfuzo.shelvesDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShelfServiceTest {

    @Test
    public void shouldConfigureShelves() {
        ShelfService ss = new ShelfService();
        Integer[] shelves = {13,  14};
        //Integer[] boxes2 = {99,  97};
        ss.configure(shelves);
        assertEquals(shelves, ss.getShelves() );
    }
}