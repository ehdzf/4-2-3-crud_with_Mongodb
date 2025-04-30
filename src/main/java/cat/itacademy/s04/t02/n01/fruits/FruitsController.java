package cat.itacademy.s04.t02.n01.fruits;

import cat.itacademy.s04.t02.n01.fruits.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitsController {
    private final GetFruitsService getFruitsService;
    private final CreateFruitService createFruitService;
    private final GetFruitByIdService getFruitByIdService;
    private final UpdateFruitByIdService updateFruitByIdService;
    private final DeleteFruitByIdService deleteFruitByIdService;

    @Autowired
    public FruitsController(GetFruitsService getFruitsService, CreateFruitService createFruitService, GetFruitByIdService getFruitByIdService, UpdateFruitByIdService updateFruitByIdService, DeleteFruitByIdService deleteFruitByIdService) {
        this.getFruitsService = getFruitsService;
        this.createFruitService = createFruitService;
        this.getFruitByIdService = getFruitByIdService;
        this.updateFruitByIdService = updateFruitByIdService;
        this.deleteFruitByIdService = deleteFruitByIdService;
    }

    @GetMapping
    public ResponseEntity<List<Fruit>> getFruits() {
        return new ResponseEntity<>(getFruitsService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit) {
        return new ResponseEntity<>(createFruitService.createFruit(fruit), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Fruit> getFruit(@PathVariable String id) {

        return new ResponseEntity<>(getFruitByIdService.getFruitById(id), HttpStatus.OK);

    }

    @PatchMapping(path = "/{id}")
    public ResponseEntity<Void> updateFruit(@PathVariable String id, @RequestBody Fruit fruit) {
            updateFruitByIdService.updateFruitById(id, fruit);
            return new ResponseEntity<>(HttpStatus.OK);


    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable String id) {
        deleteFruitByIdService.deleteFruit((id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
