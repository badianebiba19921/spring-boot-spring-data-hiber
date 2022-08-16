package com.smile.and.pay.ebb.soap;

import com.smile.and.pay.ebb.models.Marchand;
import com.smile.and.pay.ebb.models.Product;
import com.smile.and.pay.ebb.models.SmileAndPayResponse;
import com.smile.and.pay.ebb.repository.AddressRepository;
import com.smile.and.pay.ebb.repository.MarchandRepository;
import com.smile.and.pay.ebb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import javax.jws.WebService;
import java.util.Optional;

//@WebService(endpointInterface="com.smile.and.pay.ebb.soap.SmileAndPayService", targetNamespace="http://localhost:8080/SmileAndPayService", serviceName="SmileAndPayService")
public class SmileAndPayServiceImpl implements SmileAndPayService {

    /*@Autowired
    MarchandRepository marchandRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public SmileAndPayResponse addMarchand(Marchand marchand) {
        Marchand _marchand = marchandRepository.save(marchand);
        /*marchand.getAddresses()
                .forEach(address -> {
                    address.setMarchand(_marchand);
                    addressRepository.save(address);
                });*/
        /*return new SmileAndPayResponse()
                .setCodeRetour(HttpStatus.CREATED.name())
                .setMessageRetour("Marchand created");
    }

    @Override
    public SmileAndPayResponse deleteMarchandById(int marchandId) {
        Optional<Marchand> marchand = marchandRepository.findById(marchandId);
        if(marchand.isPresent()){
            marchandRepository.delete(marchand.get());
            return new SmileAndPayResponse()
                    .setCodeRetour(HttpStatus.OK.name())
                    .setMessageRetour("Marchand deleted");
        }
        return new SmileAndPayResponse()
                .setCodeRetour(HttpStatus.NO_CONTENT.name())
                .setMessageRetour("Marchand not found");
    }

    @Override
    public SmileAndPayResponse addProduct(Product product) {
        Product _product = productRepository.save(product);
        return new SmileAndPayResponse()
                .setCodeRetour(HttpStatus.CREATED.name())
                .setMessageRetour("Product created");
    }

    @Override
    public SmileAndPayResponse deleteProductById(int productId) {
        Optional<Product> product = productRepository.findById(productId);
        if(product.isPresent()){
            productRepository.delete(product.get());
            return new SmileAndPayResponse()
                    .setCodeRetour(HttpStatus.OK.name())
                    .setMessageRetour("Product deleted");
        }
        return new SmileAndPayResponse()
                .setCodeRetour(HttpStatus.NO_CONTENT.name())
                .setMessageRetour("Product not found");
    }

    @Override
    public SmileAndPayResponse associate(int marchandId, int productId) {
        Optional<Marchand> marchand = marchandRepository.findById(marchandId);
        Optional<Product> product = productRepository.findById(productId);
        if(marchand.isPresent()) {
            boolean add = marchand.get().getProducts()
                    .stream().noneMatch(_product -> _product.getId() == productId);
            if(add) {
                marchand.get().getProducts().add(product.get());
                marchandRepository.save(marchand.get());
                return new SmileAndPayResponse()
                        .setCodeRetour(HttpStatus.OK.name())
                        .setMessageRetour("Association maded");
            }
        }
        return new SmileAndPayResponse()
                .setCodeRetour(HttpStatus.NO_CONTENT.name())
                .setMessageRetour("Association maded");
    }*/
}
