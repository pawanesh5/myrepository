package com.niit.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

    @Id
    private int productId;
    private String productName;

    private ProductDiscription productDiscription;


    public Product() {
    }

    public Product(int productId, String productName, ProductDiscription productDiscription) {
        this.productId = productId;
        this.productName = productName;
        this.productDiscription = productDiscription;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public ProductDiscription getProductDiscription() {
        return productDiscription;
    }

    public void setProductDiscription(ProductDiscription productDiscription) {
        this.productDiscription = productDiscription;
    }
}
