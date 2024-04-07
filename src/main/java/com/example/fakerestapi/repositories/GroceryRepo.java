package com.example.fakerestapi.repositories;

import com.example.fakerestapi.entities.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroceryRepo extends JpaRepository<Grocery, Long> {
    List<Grocery> findAll();
}
