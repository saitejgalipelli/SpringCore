package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomeGreetings;

public class SpringBasicsTest {

	public static void main(String[] args) {
		// locate and hold spring bean cfg file
      FileSystemResource res= new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
      //create IOC container (XmlBeanFactory)
	  XmlBeanFactory factory  = new XmlBeanFactory(res);
	  //get Spring bean class objects from SpringContainer/IOC container
	  Date d= (Date)factory.getBean("dt");
	  System.out.println("d obj date:"+d);
	  System.out.println("------------------");
	  WelcomeGreetings greetings=(WelcomeGreetings)factory.getBean("wg");
	  System.out.println("message:"+greetings.Welcome("Raja"));
	  
	}//main

}//class
