package org.niit.model;

import java.util.List;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private List<Product> product;

    public void display()
    {
        System.out.println("Customer ID : "+customerId);
        System.out.println("Customer Name : "+name);
        System.out.println("Customer Age : "+email);
        //System.out.println("product Details :"+product);
        for(Product var: product)
        {
            System.out.println("product details: "+var);
        }
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(int customerId, String name, String email,List<Product> product) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.product= product;
    }
}
