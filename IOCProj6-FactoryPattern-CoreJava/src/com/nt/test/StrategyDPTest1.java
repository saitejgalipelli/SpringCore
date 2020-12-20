package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		//get vehicle class obj or target class obj;
	   Vehicle vehicle = VehicleFactory.getInstance("cng");
       vehicle.journey("India", "America");
	}

}
