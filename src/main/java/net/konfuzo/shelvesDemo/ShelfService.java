package net.konfuzo.shelvesDemo;

import org.springframework.stereotype.Component;

@Component
public class ShelfService {

    Integer[] shelves;

    public ShelfReport configure(Integer[] shelves) {
        this.shelves = shelves;
        return new ShelfReport(shelves);
    }

    public Integer[] getShelves() {
        return shelves;
    }
}
