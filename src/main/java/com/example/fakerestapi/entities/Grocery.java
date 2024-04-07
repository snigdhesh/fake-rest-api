package com.example.fakerestapi.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.startup.FailedContext;

@Entity
@Table(name = "groceries",schema = "sandbox")
@Data
public class Grocery {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double price;

}
