package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator static-block");
	}
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator 1 Param Constructor");
	      this.date =date;
	}
	
	public String generateWishMessage(String user) {
		
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour= date.getHours();
		if(hour<12)
			return "Good Morning:"+user;
		if(hour<16)
			return "Good Afternoon:"+user;
		if(hour<20)
			return "Good Evening:"+user;
		else
			return "Good night:"+user;
		
		
	}
	
	
	
}