//Printer.java(Singleton java class with minimum standards
package com.nt.singleton;

public class Printer {
	// static referecne variable
	private static Printer INSTANCE;

	// private constructor
	private Printer() {
		System.out.println("Pritner: 0 param constructor");
	}

	public static Printer getInstance() {
	if(INSTANCE==null) 
		INSTANCE  = new Printer();
		return INSTANCE;
	}

	public void printData(String msg) {
		System.out.println(msg);
	}
}
