package com.nt.comps;

public class Vehicle {
	private IEngine engg; // HAS-A property /composition

	public void setEngg(IEngine engg) {
		this.engg = engg;
	}

	public void journey(String sourcePlace, String destPlace) {
		engg.start();
		System.out.println("Jounery started at::" + sourcePlace);
		System.out.println("Journey is going on .........");
		engg.stop();
		System.out.println("Jounery ended at::" + destPlace);
	}

}
