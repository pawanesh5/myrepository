package org.niit;

import org.niit.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Hello world!
 *
 *
 */
public class App 
{
    public void getCustomerBean()
    {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/niit/spring-beans.xml");
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("F:\\work\\BEJ_C1_S3_Spring_IOC_xml_PC3.3\\src\\main\\java\\Spring-beans.xml");
        Customer customer = (Customer) applicationContext.getBean("customer");
        customer.display();
        System.out.println("Customer Name via getter method : "+customer.getCustomerId());


    }

    public static void main( String[] args )
    {
        App app = new App();
        app.getCustomerBean();
    }
}
