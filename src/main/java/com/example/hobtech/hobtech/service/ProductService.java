package com.example.hobtech.hobtech.service;

import com.example.hobtech.hobtech.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    void SaveProd(Product prod);
    public List<Product> ShowProd();
}
