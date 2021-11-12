package com.niit.repository;


import com.niit.model.Product;
import com.niit.model.ProductDiscription;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@DataMongoTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;
    private Product product;
    private ProductDiscription productDiscription;


    @BeforeEach
    public void setUp()
    {
              productDiscription = new ProductDiscription(4,48000,"OnePlus");
              product=new Product(2,"oneplus2Tplus",productDiscription);
    }

    @AfterEach
    public void tearDown(){
        productDiscription=null;
        product=null;
    }

    @Test
    public void saveProductTest() {
        productRepository.insert(product);
        Product product1 = productRepository.findById(product.getProductId()).get();
        assertEquals(product.getProductId(),product1.getProductId());
    }


    @Test
    public void deleteProductByIdTest()
    {
        ProductDiscription pd2=new ProductDiscription(4,48000,"OnePlus");
        Product product2=new Product(2,"oneplus2Tplus",productDiscription);
        productRepository.save(product2);
        productRepository.delete(product2);
        boolean actualResult= productRepository.existsById(2);
        assertFalse(actualResult);
    }


    @Test
    public void getAllProductsTest()
    {
        int size= productRepository.findAll().size();
        assertEquals(1,size);

    }



}
