package learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//    	Tyre obj=(Tyre)context.getBean("tyre");
//    	System.out.println(obj);
//    	Vehicle obj = (Vehicle)context.getBean("car");
//    	obj.drive();
    	ApplicationContext context1= new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s8= context1.getBean(Samsung.class);
    	s8.config();
    	AnnotationConfigApplicationContext ctx= (AnnotationConfigApplicationContext)context1;
    	ctx.close();
    }
}
