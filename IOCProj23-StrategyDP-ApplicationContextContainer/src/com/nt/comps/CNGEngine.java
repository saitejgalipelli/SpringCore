package com.nt.comps;

public final class CNGEngine implements IEngine {

	public CNGEngine() {
		System.out.println("CNGEngine 0 param constrctor");
	}

	@Override
	public void start() {
		System.out.println("CNG engine is started");

	}

	@Override
	public void stop() {
		System.out.println("CNG engine is stopped");

	}
}
