package io.github.wilsontheory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.github.wilsontheory.service.CatService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	CatService catService = context.getBean("catService", CatService.class);
    	System.out.println(catService.getRussianBlue().getName());
    	System.out.println(catService.getSiamese().getName());
        System.out.println( "Hello World!" );
        catService.getRussianBlue().setName("Vladimir");
        catService.getCalico().sendMeow("Hello?");
        try {
        	catService.getCalico().setName("Ceiling cat");
        } catch (RuntimeException e){}
    }
}
