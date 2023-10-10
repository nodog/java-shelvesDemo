package net.konfuzo.shelvesDemo;

import java.util.List;

public record BoxesOnShelvesReport(List<Shelf> shelvesWithBoxes,
                                   List<Integer> remainingBoxes,
                                   List<Integer> remainingShelves) {
}
