package com.niit.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter @Setter
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

}
