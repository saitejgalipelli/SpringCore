package com.nt.factory;

import com.nt.comp.BudgetCar;
import com.nt.comp.ICar;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportsCar;

public class CarFactory {
	
	//factory method having factory pattern logic
  public static ICar getInstance(String type) {
	  ICar car= null;
	  if(type.equalsIgnoreCase("Luxory"))
	     car= new LuxoryCar();
	  else  if(type.equalsIgnoreCase("Budget"))
		  car= new BudgetCar();
	  else  if(type.equalsIgnoreCase("Sports"))
		  car= new SportsCar();
	  else
		  throw new IllegalArgumentException("Invalid Car Type");
	     
		 return car; 	     
  }
}
