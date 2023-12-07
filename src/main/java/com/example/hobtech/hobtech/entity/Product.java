package com.example.hobtech.hobtech.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="prod-table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int quantity;
    private String name;
    private double price;
}
