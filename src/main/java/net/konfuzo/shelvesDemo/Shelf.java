package net.konfuzo.shelvesDemo;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

    public List<Integer> boxes;
    public Integer size;

    public Shelf(Integer size) {
        this.size = size;
        boxes = new ArrayList<Integer>();
    }
    public void store(Integer boxSize) {
        boxes.add(boxSize);
    }
}
