package com.niit.model;

public class ProductDiscription {

    private int productQuant;
    private int price;
    private String brand;


    public ProductDiscription() {
    }

    public ProductDiscription(int productQuant, int price, String brand) {
        this.productQuant = productQuant;
        this.price = price;
        this.brand = brand;
    }

    public int getProductQuant() {
        return productQuant;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProductQuant(int productQuant) {
        this.productQuant = productQuant;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
