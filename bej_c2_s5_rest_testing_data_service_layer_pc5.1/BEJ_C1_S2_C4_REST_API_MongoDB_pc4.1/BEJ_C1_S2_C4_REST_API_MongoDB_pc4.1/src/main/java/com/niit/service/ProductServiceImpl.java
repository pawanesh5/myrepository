package com.niit.service;


import com.niit.exception.ProductAlreadyExistException;
import com.niit.exception.ProductNotFoundException;
import com.niit.model.Product;
import com.niit.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) throws ProductAlreadyExistException {
        if(productRepository.findById(product.getProductId()).isPresent()){
            throw new ProductAlreadyExistException();
        }
        return productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(int id) throws ProductNotFoundException {
        boolean result=false;
        if(productRepository.findById(id).isEmpty()){
            throw new ProductNotFoundException();
        }
        else{
            productRepository.deleteById(id);
            result=true;
        }
        return result;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findProductByBrand(String brand) {
        return productRepository.findProductByBrand(brand);
    }

    @Override
    public Product updateProduct(Product product) {
        Product pro1 = productRepository.save(product);
        return pro1;
    }


}
