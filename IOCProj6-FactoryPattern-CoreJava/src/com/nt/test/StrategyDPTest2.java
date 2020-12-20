package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest2 {

	public static void main(String[] args) {
		//get vehicle class obj or target class obj;
	   Vehicle vehicle = VehicleFactory.getInstance("diesel");
       vehicle.journey("India", "Paris");
	}

}
