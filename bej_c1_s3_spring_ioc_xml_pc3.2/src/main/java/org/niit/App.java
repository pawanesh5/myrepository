package org.niit;
import org.niit.model.Cab;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public void getCabBean()
    {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("F:\\work\\backend\\bej_c1_s3_spring_ioc_xml_pc3.2\\src\\main\\java\\Spring-bean.xml");
        Cab cab = (Cab)applicationContext.getBean("cab");
        cab.display();
        // System.out.println("CAB ID via getter method:"+cab.getCabnumber());
    }
    public static void main( String[] args )
    {
        App app = new App();
        app.getCabBean();
    }
}
