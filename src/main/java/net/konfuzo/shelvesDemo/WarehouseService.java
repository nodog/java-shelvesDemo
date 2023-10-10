package net.konfuzo.shelvesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class WarehouseService {

    private ShelfService shelfService;
    private BoxService boxService;
    @Autowired
    public void setShelfService(ShelfService ss) {
        this.shelfService = ss;
    }
    @Autowired
    public void setBoxService(BoxService bs) {
        this.boxService = bs;
    }

    public BoxesOnShelvesReport arrangeBoxesOnShelves() {
        Integer[] boxes = this.boxService.getBoxes();
        Integer[] shelfSizes = this.shelfService.getShelves();

        List<Shelf> engagedShelves = new ArrayList<Shelf>();
        List<Integer> remainingBoxes = new ArrayList<Integer>();
        List<Integer> remainingShelfSizes = new ArrayList<Integer>();

        int lenBoxes = boxes.length;
        int lenShelfSizes = shelfSizes.length;
        int i = 0;
        while (i < lenBoxes || i < lenShelfSizes) {
            if (i < lenBoxes && i < lenShelfSizes) {
                Shelf newShelf = new Shelf(shelfSizes[i]);
                newShelf.store(boxes[i]);
                engagedShelves.add(newShelf);
            } else if (i >= lenBoxes) {
                remainingShelfSizes.add(shelfSizes[i]);
            } else {
                remainingBoxes.add(boxes[i]);
            }
            i++;
        }

        return new BoxesOnShelvesReport(engagedShelves, remainingBoxes, remainingShelfSizes);
    }
}
