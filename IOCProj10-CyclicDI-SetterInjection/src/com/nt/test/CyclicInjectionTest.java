package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;



public class CyclicInjectionTest {
	public static void main(String[] args) {
		//Create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// Create XmlBeanDefinitation Reader
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		//Load spring bean cfg file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bean obj
		A a = factory.getBean("a1", A.class);
		System.out.println(a);
	}

}
