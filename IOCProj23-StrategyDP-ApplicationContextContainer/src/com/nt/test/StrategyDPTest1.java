package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.comps.PetrolEngine;
import com.nt.comps.Vehicle;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		// create Container
		// ApplicationContext ctx = new
		// FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		PetrolEngine p1 = ctx.getBean("pEngine",PetrolEngine.class);
		PetrolEngine p2 = ctx.getBean("pEngine",PetrolEngine.class);

		System.out.println(p1.hashCode() + "  " + p2.hashCode());
		Vehicle v1 = ctx.getBean("vehicle",Vehicle.class);
		Vehicle v2 = ctx.getBean("vehicle",Vehicle.class);
		
		System.out.println(v1.hashCode() + "  " + v2.hashCode());
//		Vehicle vehicle =ctx.getBean("vehicle",Vehicle.class);
//		System.out.println(".................");
//	vehicle.journey("Hyd", "Goa");
//	//close container
//	((AbstractApplicationContext) ctx).close();
	}// main
}// class
