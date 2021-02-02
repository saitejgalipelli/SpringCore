package com.nt.beans;

public class Bluedart implements ICourier {

	public Bluedart() {
		System.out.println("Bluedart : 0 param constructor");
	}

	@Override
	public String deliver(int oid) {

		return "Delivering(Bluedart) products  having " + oid + "order id";
	}

}
