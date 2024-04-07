package com.example.fakerestapi.services;

import com.example.fakerestapi.entities.Grocery;
import com.example.fakerestapi.repositories.GroceryRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class GroceryService {

    @Autowired
    private GroceryRepo groceryRepo;

    public List<Grocery> getGroceries() {
        return groceryRepo.findAll();
    }

    public Grocery upsertGrocery(Grocery grocery) {
        return groceryRepo.save(grocery);
    }

    public void deleteGrocery(long id) {
        groceryRepo.deleteById(id);
    }
}
