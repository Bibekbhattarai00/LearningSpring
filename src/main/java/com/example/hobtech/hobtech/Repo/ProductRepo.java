package com.example.hobtech.hobtech.Repo;

import com.example.hobtech.hobtech.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo  extends JpaRepository<Product,Integer> {
}
