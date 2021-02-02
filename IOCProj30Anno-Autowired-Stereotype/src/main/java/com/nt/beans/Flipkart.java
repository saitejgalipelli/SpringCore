package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
     @Autowired
	private ICourier courier;
	 
     

 public void setCourier(ICourier courier) {
	 System.out.println("Flipkart setter method");
		this.courier = courier;
	}
public Flipkart() {
	System.out.println("Flipkart 0 param constructor");
}
	public String shopping(String items[], float prices[]) {
	
		float billAmt = 0.0f;
		for (float p : prices)
			billAmt = billAmt + p;
		// generate order id
		int oid = new Random().nextInt(10000);
		// use courier
		String msg = courier.deliver(oid);
		String finalMsg = Arrays.toString(items) + "are shopped having prices" + Arrays.toString(prices)
				+ "with bill Amt:" + billAmt + "--->" + msg;
		return finalMsg;

	}

}
