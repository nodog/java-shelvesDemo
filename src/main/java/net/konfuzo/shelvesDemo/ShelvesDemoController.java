package net.konfuzo.shelvesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShelvesDemoController {
    private ShelfService shelfService;
    private BoxService boxService;
    private WarehouseService warehouseService;

    @Autowired
    public void setShelfService(ShelfService ss) {
        this.shelfService = ss;
    }
    @Autowired
    public void setBoxService(BoxService bs) {
        this.boxService = bs;
    }
    @Autowired
    public void setWarehouseService(WarehouseService ws) {
        this.warehouseService = ws;
    }

    @PostMapping(value = "/configureShelves",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ShelfReport configureShelves(@RequestBody Integer[] shelves) {
        return shelfService.configure(shelves);
    }

    @PostMapping(value = "/deliverBoxes",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public BoxReport deliverBoxes(@RequestBody Integer[] boxes) {
        return boxService.deliver(boxes);
    }

    @GetMapping(value = "/reportBoxesOnShelves",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public BoxesOnShelvesReport arrangeBoxesOnShelves() {
        return warehouseService.arrangeBoxesOnShelves();
    }
}
