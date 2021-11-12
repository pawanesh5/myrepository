package com.niit.service;


import com.niit.exception.ProductAlreadyExistException;
import com.niit.exception.ProductNotFoundException;
import com.niit.model.Product;

import java.util.List;

public interface ProductService {


    public Product saveProduct(Product product) throws ProductAlreadyExistException;
    public boolean deleteProduct(int id) throws ProductNotFoundException;
    public List<Product> getAllProduct();
    List<Product> findProductByBrand(String brand);
    public Product updateProduct(Product product);




}
