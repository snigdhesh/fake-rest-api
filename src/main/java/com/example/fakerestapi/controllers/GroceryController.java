package com.example.fakerestapi.controllers;

import com.example.fakerestapi.entities.Grocery;
import com.example.fakerestapi.services.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroceryController {

    @Autowired
    private GroceryService groceryService;

    @GetMapping(value = "/groceries",produces = "application/json")
    public List<Grocery> getGroceries(){
        return groceryService.getGroceries();
    }

    @PostMapping(value = "/groceries",consumes = "application/json")
    public Grocery createNewGrocery(@RequestBody Grocery grocery){
        return groceryService.upsertGrocery(grocery);
    }

    @PutMapping(value = "/groceries",consumes = "application/json")
    public Grocery updateGrocery(@RequestBody Grocery grocery){
        return groceryService.upsertGrocery(grocery);
    }

    @DeleteMapping(value = "/groceries/{id}")
    public void updateGrocery(@PathVariable long id){
        groceryService.deleteGrocery(id);
    }
}
