package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	 @Autowired
	 //@Qualifier("dhl")
	private ICourier courier;

//	@Autowired
//
//	@Qualifier("dhl")
	public void setCourier(ICourier courier) {
		this.courier = courier;
	}
	
//	@Autowired
//	@Qualifier("dhl")
//	public void assign(ICourier cr) {
//		System.out.println("Flipkart.assign()");
//		this.courier=cr;
//	}
	
	

	public Flipkart() {
		System.out.println("Flipkart: 0-param constructor");

	}
//    @Autowired
// 
//	public Flipkart(   @Qualifier("bDart")ICourier courier) {
//	System.out.println("Flipkart param Constructor");
//	this.courier = courier;
//}

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

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}

}
