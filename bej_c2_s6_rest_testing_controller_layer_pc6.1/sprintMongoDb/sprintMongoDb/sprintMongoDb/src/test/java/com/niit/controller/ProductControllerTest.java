package com.niit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.niit.exception.ProductNotFoundException;
import com.niit.model.Product;
import com.niit.model.ProductDiscription;
import com.niit.service.ProductService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {


    @Autowired
    private MockMvc mockMvc;
    @Mock
    private ProductService productService;
    private Product product1,product2;
    private ProductDiscription productDiscription1,productDiscription2;
    @InjectMocks
    private ProductController productController;
    @BeforeEach
    public void setUp(){
        productDiscription1 = new ProductDiscription(1,24000,"Realme");
        product1 = new Product(3,"Realme5pro ",productDiscription1);
        productDiscription2  = new ProductDiscription(1,43000,"Sony");
        product2 = new Product(4,"ExperiaPlus00234",productDiscription1);
        mockMvc= MockMvcBuilders.standaloneSetup(productController).build();
    }
    @AfterEach
    public void tearDown(){
        productDiscription1=null;
        product1=null;
        productDiscription2=null;
        product2=null;
        mockMvc=null;
    }
    @Test
    public void saveCustomer() throws Exception {
        when(productService.saveProduct(any())).thenReturn(product1);
        mockMvc.perform(post("/api/v1/productService/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsontoString(product1)))
                .andExpect(status().isCreated())
                .andDo(MockMvcResultHandlers.print());
        verify(productService,times(1)).saveProduct(any());
    }

    private String jsontoString(final Object obj) {
        String result;
        try {
            ObjectMapper objectMapper=new ObjectMapper();
            String jsonContent = objectMapper.writeValueAsString(obj);
            result = jsonContent;
        }
        catch (JsonProcessingException ex){
            result="error while converting to string";
        }
        return result;
    }


    @Test
    public void deleteProductTest() throws Exception{
        mockMvc.perform( delete("/api/v1/productService/delete/1", 1) )
                .andExpect(status().isNotFound());

    }

    @Test
    public void getAllProduct() throws Exception
    {
        mockMvc.perform(get("/api/v1/productService/product")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void findByProductBrand() throws Exception{
        when(productService.findProductByBrand("samsung")).thenReturn(Collections.singletonList(product2));
        mockMvc.perform(get("/api/v1/productService/product/samsung")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

}
