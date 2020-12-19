package com.nt.beans;

public class WelcomeGreetings {
	static {
		System.out.println("WelcomeGreetings.static block");
	}
   public WelcomeGreetings() {
	   System.out.println("WelcomeGreetig: 0-param constructor");
   }
   public String Welcome(String user) {
	   return "welcome to string::"+user;
   }
}
