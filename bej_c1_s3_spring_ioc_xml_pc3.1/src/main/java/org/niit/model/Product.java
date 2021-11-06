package org.niit.model;

public class Product {
    private ProductDetails productDetails;
    private int productid;
    private String productName;
    private  float productprice;

    public Product(int productid, String productName, float productprice,ProductDetails productDetails) {

        this.productid = productid;
        this.productName = productName;
        this.productprice = productprice;
        this.productDetails = productDetails;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public  void dispaly()
    {
        System.out.println("product id: "+productid);
        System.out.println("product name: "+productName);
        System.out.println("product price: "+productprice);
        System.out.println("product company: "+productDetails.getCompany());
        System.out.println("Manufature on: "+productDetails.getManufacture());
        System.out.println("product quantity: "+productDetails.getQuantity());

    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductprice() {
        return productprice;
    }

    public void setProductprice(float productprice) {
        this.productprice = productprice;
    }
}
