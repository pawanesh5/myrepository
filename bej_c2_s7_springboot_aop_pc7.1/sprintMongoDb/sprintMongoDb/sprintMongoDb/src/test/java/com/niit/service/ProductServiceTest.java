package com.niit.service;


import com.niit.exception.ProductAlreadyExistException;
import com.niit.exception.ProductNotFoundException;
import com.niit.model.Product;
import com.niit.model.ProductDiscription;
import com.niit.repository.ProductRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;
    private Product product1,product2;
    private ProductDiscription productDiscription1,productDiscription2;


    @BeforeEach
    public void setUp(){

        productDiscription1 = new ProductDiscription(1,24000,"Realme");
        product1 = new Product(3,"Realme5pro ",productDiscription1);
        productDiscription2  = new ProductDiscription(1,43000,"Sony");
        product2 = new Product(4,"ExperiaPlus00234",productDiscription1);

    }


    @AfterEach
    public void tearDown(){
        productDiscription1=null;
        product1=null;
        productDiscription2=null;
        product2=null;
    }

     @Test
    public void saveProductTest() throws ProductAlreadyExistException {
        when(productRepository.save(any())).thenReturn(product1);
        assertEquals(product1,productService.saveProduct(product1));
        verify(productRepository,times(1)).save(any());
        verify(productRepository,times(1)).findById(any());
    }


    @Test
    public void getAllProductTest()
    {
        when(productRepository.findAll()).thenReturn(Stream.of(product1,product2).collect(Collectors.toList()));
        assertEquals(2,productService.getAllProduct().size());
    }


    @Test
    public void findProductbyBrand()
    {
        when(productRepository.findAll()).thenReturn(Stream.of(product1,product2).collect(Collectors.toList()));
        assertEquals(0,productService.findProductByBrand("oppo").size());

    }


}



