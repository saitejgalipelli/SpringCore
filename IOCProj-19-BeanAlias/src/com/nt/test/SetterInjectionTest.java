package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	
	public static void main(String[]args) {
	// hold the name and location of spring bean file
 FileSystemResource res= new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
 // create the IOC container
 XmlBeanFactory factory = new XmlBeanFactory(res);
 // get target spring class object
 WishMessageGenerator generator = (WishMessageGenerator)factory.getBean("wishMessageGenerator");
 WishMessageGenerator generator1 = (WishMessageGenerator)factory.getBean("wmg1");
 WishMessageGenerator generator2 = (WishMessageGenerator)factory.getBean("wmg2");
 
 System.out.println(generator.hashCode()+"....."+generator1.hashCode()+"....."+generator2.hashCode());
 WishMessageGenerator generator3 = (WishMessageGenerator)factory.getBean("msg2");
 WishMessageGenerator generator4 = (WishMessageGenerator)factory.getBean("msg3");
 WishMessageGenerator generator5 = (WishMessageGenerator)factory.getBean("msg4");
 System.out.println(generator3.hashCode()+"....."+generator4.hashCode()+"....."+generator5.hashCode());
 
	}
 
}
