package com.nt.test;

import com.nt.comp.ICar;
import com.nt.factory.CarFactory;

public class CarCustomer1 {
	
	public static void main(String[] args) {
		//get Car
		ICar car=CarFactory.getInstance("Budget");
	   System.out.println(car.getClass());
	   car.drive();
	   car.addAccessories();
	}
	

}
