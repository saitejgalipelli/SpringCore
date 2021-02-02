package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	@Autowired
	@Qualifier("dhl")
	private ICourier courier;

	public Flipkart() {
		System.out.println("Flipkart: 0-param constructor");

	}

	public String shopping(String items[], float prices[]) {
		float billAmt = 0.0f;
		for (float p : prices)
			billAmt = billAmt + p;
		// generate order id
		int oid = new Random().nextInt(10000);
		// use courier
		String msg = courier.deliver(oid);
		String finalMsg = Arrays.toString(items)+"are shopped having prices"+Arrays.toString(prices)+"with bill Amt:"+billAmt+ "--->"+msg;
		return finalMsg;
	}

}
