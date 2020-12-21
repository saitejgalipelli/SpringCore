package com.nt.factory;

import com.nt.comps.BlueDartCourier;
import com.nt.comps.DTDCCourier;
import com.nt.comps.EkartCourier;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;

public class ProductFactory {
	public static Flipkart getInstance(String type) {
		ICourier courier =null;
		if(type.equalsIgnoreCase("bluedart"))
		courier= new BlueDartCourier();
		else if(type.equalsIgnoreCase("dtdc"))
		courier= new DTDCCourier();
		else if(type.equalsIgnoreCase("ekart"))
		courier= new EkartCourier();
		 else
			  throw new IllegalArgumentException("Invalid courier Type");
		
		Flipkart flipkart = new Flipkart();
		flipkart.setCourier(courier);
		return flipkart;
		
		
	}
	
}
