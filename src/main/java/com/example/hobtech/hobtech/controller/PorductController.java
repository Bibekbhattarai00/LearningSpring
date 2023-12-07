package com.example.hobtech.hobtech.controller;

import com.example.hobtech.hobtech.entity.Product;
import com.example.hobtech.hobtech.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
//@RequiredArgsConstructor
public class PorductController {
    private ProductService prodService;

    public PorductController(ProductService prodService) {

        this.prodService = prodService;

    }

    @PostMapping
    public void saveProd (@RequestBody Product product){
        prodService.SaveProd(product);
    }

    @GetMapping("/allProducts")
    public void viewProducts(){
        prodService.ShowProd();
    }
}
