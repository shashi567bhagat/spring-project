package com.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

	
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springtest/config.xml");
		
		//ye IOC Container ko fully data de diya
		
		System.out.println(context);
		
		Ram r=context.getBean("ram",Ram.class);
		r.Eat();
		r.sleep();
		
		Shyam s=context.getBean("shyam",Shyam.class);
		s.Eat();
		s.sleep();
	
		
		
	}
}
