package com.smile.and.pay.ebb.service;

import com.smile.and.pay.ebb.models.Marchand;
import com.smile.and.pay.ebb.repository.AddressRepository;
import com.smile.and.pay.ebb.repository.MarchandRepository;
import com.smile.and.pay.ebb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarchanService {

    @Autowired
    MarchandRepository marchandRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    AddressRepository addressRepository;

    public Marchand insertMarchand(Marchand marchand) {
        System.out.println("insertMarchand ==> " + marchandRepository);
        System.out.println("insertMarchand ==> " + productRepository);
        System.out.println("insertMarchand ==> " + addressRepository);
        return marchandRepository.save(marchand);
    }
}
