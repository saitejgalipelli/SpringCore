package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator static-block");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator Constructor");
	}
	
	
	public void setDate(Date date) {
		this.date = date;

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