package net.konfuzo.shelvesDemo;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxServiceTest {

    @Test
    public void shouldReceiveBoxes() {
        BoxService bs = new BoxService();
        Integer[] boxes = {99,  98};
        //Integer[] boxes2 = {99,  97};
        bs.deliver(boxes);
        assertEquals(boxes, bs.getBoxes() );
    }

    @Test
    public void shouldReportBoxes() {
        BoxService bs = new BoxService();
        Integer[] boxes = {99,  98};
        BoxReport br = bs.deliver(boxes);
        assertEquals(new BoxReport(boxes), br );
    }

}