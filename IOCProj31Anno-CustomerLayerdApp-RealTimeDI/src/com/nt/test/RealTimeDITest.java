package com.nt.test;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.BankController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Controller class obj from IOC container
		BankController controller = ctx.getBean("controller", BankController.class);
		// read inputs from end user
       //create scanner class obj
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String name = sc.next();
		System.out.println("Enter Customer addresss:");
		String addrs = sc.next();
		System.out.println("Enter Principle Amount:");
		String pAmt = sc.next();
		System.out.println("Enter Rate of Interest:");
		String rate = sc.next();
		System.out.println("Enter Time of Interest:");
		String time = sc.next();

		CustomerVO vo = new CustomerVO();
		vo.setCname(name);
		vo.setCadd(addrs);
		vo.setPAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);

		// invoke method

		try {
			// use controller class

			String result = controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Problem in Customer Registration");
			e.printStackTrace();
		}

	}// main

}// class
