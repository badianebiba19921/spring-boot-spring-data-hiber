package com.smile.and.pay.ebb.repository;

import com.smile.and.pay.ebb.models.Marchand;
import com.smile.and.pay.ebb.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarchandRepository extends JpaRepository<Marchand, Integer> {
}
