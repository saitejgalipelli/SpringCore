package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class AwareInjectionTest {
    public static void main( String[] args ){
    //create IOC container
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	// get Target bean class object
    	//System.out.println("-------------------------------------");
    	Cricketer cricketer = ctx.getBean("cricketer",Cricketer.class);
    	System.out.println("-------------------------------------");
    	cricketer.batting();
    	System.out.println("-------------------------------------");
    	cricketer.batting();
    	System.out.println("-------------------------------------");
    	cricketer.bowling();
    	System.out.println("-------------------------------------");
    	cricketer.feilding();
    }	
}
