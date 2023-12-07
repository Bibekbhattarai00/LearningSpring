package com.example.hobtech.hobtech.service.impl;
import com.example.hobtech.hobtech.Repo.ProductRepo;
import com.example.hobtech.hobtech.entity.Product;
import com.example.hobtech.hobtech.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;

@Service
//@RequiredArgsConstructor
public class PordImpl implements ProductService {

    private ProductRepo prodRepo;

    public PordImpl(ProductRepo prodRepo) {
        this.prodRepo = prodRepo;
    }

    @Override
    public void SaveProd(Product prod) {
        prodRepo.save(prod);
    }

    @Override
    public List<Product> ShowProd() {
       return prodRepo.findAll();
    }
}
