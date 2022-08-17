package com.smile.and.pay.ebb.repository;

import com.smile.and.pay.ebb.models.Address;
import com.smile.and.pay.ebb.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
