package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Customer;
import com.nt.beans.Marks;
import com.nt.beans.Person;
import com.nt.beans.Student;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		//Create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	    //Create XmlBeanDefinitationReader
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		//Load and parse Spring Bean cfg file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get Spring Bean class obj
		Student st= factory.getBean("st",Student.class);
     	System.out.println("object data:"+st);
		System.out.println("----------------------");
		Student st1=factory.getBean("st1",Student.class);
		System.out.println("object data::"+st1);
		System.out.println("----------------------");
		Student st2=factory.getBean("st2",Student.class);
		System.out.println("object data::"+st2);
		System.out.println("---------------------------------");
		Marks mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);
		System.out.println("---------------------------------");
		Person per=factory.getBean("per",Person.class);
		System.out.println(per);
		System.out.println("---------------------------------");
		Customer cust=factory.getBean("cust",Customer.class);
		System.out.println(cust);
		
	
	}

}
