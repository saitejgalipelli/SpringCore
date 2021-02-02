package com.nt.comps;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine 0 param constrctor");
	}

	@Override
	public void start() {
		System.out.println("Diesel engine is started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Diesel engine is stopped");

	}

}
