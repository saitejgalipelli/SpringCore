package com.nt.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {
	public static void main(String[] args) {
		
	
	//Create IOC container
	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	// create Local object
	Locale locale = new Locale(args[0],args[1]);
	//get Messages..
	 String msg1 = ctx.getMessage("wishMessage", new Object[]{"buddy","welcome"} ,"msg1", locale);
	 String msg2 = ctx.getMessage("welcome.message", new Object[]{} ,"msg2", locale);
	 String msg3 = ctx.getMessage("bye.message", new Object[]{} ,"msg3", locale);
       
	 System.out.println(msg1+"  "+msg2+" "+msg3);
	 
	 ((AbstractApplicationContext) ctx).close();
	}  
}
