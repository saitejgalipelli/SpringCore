package com.nt.comps;

public class Vehicle {
	private IEngine engg; // HAS-A property /composition
	private String type;
	
     public void setType(String type) {
		this.type = type;
	}
	public Vehicle() {
		System.out.println("Vehicle 0 param constructor");
		
	}
	public Vehicle(IEngine engg) {
		System.out.println("Vehicle 1 param constructor");
		this.engg = engg;
	}
	public void setEngg(IEngine engg) {
		this.engg = engg;
	}

	public void journey(String sourcePlace, String destPlace) {
		engg.start();
		System.out.println("Jounery started at::" + sourcePlace);
		System.out.println("Journey is going on ........."+type);
		engg.stop();
		System.out.println("Jounery ended at::" + destPlace);
	}

}
