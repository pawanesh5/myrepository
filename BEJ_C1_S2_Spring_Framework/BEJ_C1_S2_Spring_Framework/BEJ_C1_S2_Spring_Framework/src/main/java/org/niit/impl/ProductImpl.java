package org.niit.impl;

import org.niit.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ProductImpl
{
    public void getProductBean()
    {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("F:\\work\\BEJ_C1_S2_Spring_Framework\\BEJ_C1_S2_Spring_Framework\\BEJ_C1_S2_Spring_Framework\\src\\main\\java\\spring-beans.xml");
        Product product =(Product) applicationContext.getBean("product");
        product.dispaly();
        System.out.println("Product Name via getter method:"+product.getProductName());
    }
}
