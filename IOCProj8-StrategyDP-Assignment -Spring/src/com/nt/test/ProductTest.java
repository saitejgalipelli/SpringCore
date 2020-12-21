package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.comps.Flipkart;


public class ProductTest {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		Flipkart flipkart = factory.getBean("flipkart",Flipkart.class);
		flipkart.productPickedAt("Mumbai", "Hyd");
	}

}
