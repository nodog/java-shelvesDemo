package net.konfuzo.shelvesDemo;

import org.springframework.stereotype.Component;

@Component
public class BoxService {

    Integer [] boxes;
    public BoxReport deliver(Integer[] boxes) {
        this.boxes = boxes;
        return new BoxReport(boxes);
    }

    public Integer[] getBoxes() {
        return boxes;
    }
}

