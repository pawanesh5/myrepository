package com.niit.controller;


import com.niit.exception.ProductAlreadyExistException;
import com.niit.exception.ProductNotFoundException;
import com.niit.model.Product;
import com.niit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/productService/")
public class ProductController {

    @Autowired
    private ProductService productService;
    private ResponseEntity responseEntity;



    @PostMapping("add")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) throws ProductAlreadyExistException {
        try{
            productService.saveProduct(product);
            responseEntity = new ResponseEntity(product, HttpStatus.CREATED);
        }
        catch (ProductAlreadyExistException e){
            throw new ProductAlreadyExistException();
        }
        catch (Exception ex){
            responseEntity=new ResponseEntity("error while adding Product data",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") int id) throws ProductNotFoundException {
        try{
           productService.deleteProduct(id);
            responseEntity=new ResponseEntity("Product deleted successfully",HttpStatus.OK);
        }
        catch (ProductNotFoundException e){
            throw new ProductNotFoundException();
        }
        catch (Exception ex){
            responseEntity=new ResponseEntity("error while Deleting Product data",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("product")
    public ResponseEntity<?> getAllProduct(){
        try {
            responseEntity=new ResponseEntity(productService.getAllProduct(),HttpStatus.OK);
        }
        catch (Exception ex){
            responseEntity=new ResponseEntity("error while fetching product data",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("product/{brand}")
    public ResponseEntity<?> getProductByBrand(@PathVariable("brand") String brand){
        try {
            responseEntity=new ResponseEntity(productService.findProductByBrand(brand),HttpStatus.OK);
        }
        catch (Exception ex){
            responseEntity=new ResponseEntity("error while fetching product by Brand",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("update")
    public  ResponseEntity<?> updateProduct(Product product)
    {
        try {
            responseEntity=new ResponseEntity(productService.updateProduct(product),HttpStatus.OK);
        }
        catch (Exception ex){
            responseEntity=new ResponseEntity("error while updating product ",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

}
