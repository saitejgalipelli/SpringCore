package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class TraditionalDependencyLookupTest {
    public static void main( String[] args ){
    //create IOC container
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	// get Target bean class object
    	Cricketer cricketer = ctx.getBean("cricketer",Cricketer.class);
    	
    	cricketer.batting();
    	cricketer.bowling();
    	cricketer.feilding();
    }	
}
