package com.nt.factory;

import com.nt.comps.CNGEngine;
import com.nt.comps.DieselEngine;
import com.nt.comps.IEngine;
import com.nt.comps.PetrolEngine;
import com.nt.comps.Vehicle;

public class VehicleFactory {
	
	//factory method having factory pattern logic
  public static Vehicle getInstance(String type) {
	  IEngine engg= null;
	  if(type.equalsIgnoreCase("cng"))
	     engg= new CNGEngine();
	  else  if(type.equalsIgnoreCase("diesel"))
		  engg= new DieselEngine();
	  else  if(type.equalsIgnoreCase("petrol"))
		  engg= new PetrolEngine();
	  else
		  throw new IllegalArgumentException("Invalid engine Type");
	  Vehicle vehicle = new Vehicle();
	   vehicle.setEngg(engg);
	     
		 return vehicle; 	     
  }
}
