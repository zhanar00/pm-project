package com.example.buysell.repositories;

import com.example.buysell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query method to find products by their title
    List<Product> findByTitle(String title);
}
