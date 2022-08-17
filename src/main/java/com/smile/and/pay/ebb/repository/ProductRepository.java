package com.smile.and.pay.ebb.repository;

import com.smile.and.pay.ebb.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
