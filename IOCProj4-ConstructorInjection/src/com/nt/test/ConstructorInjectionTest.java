package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	
	public static void main(String[]args) {
	// hold the name and location of spring bean file
 FileSystemResource res= new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
 // create the IOC container
 XmlBeanFactory factory = new XmlBeanFactory(res);
 // get target spring class object
 WishMessageGenerator generator = (WishMessageGenerator)factory.getBean("wmg");
 System.out.println("Result:"+generator.generateWishMessage("raja"));
 
	}
 
}
