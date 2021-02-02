package com.nt.comps;

public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine 0 param constructor");
	}

	@Override
	public void start() {
		System.out.println("Petrol engine is started");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Petrol engine is stopped");

	}

}
