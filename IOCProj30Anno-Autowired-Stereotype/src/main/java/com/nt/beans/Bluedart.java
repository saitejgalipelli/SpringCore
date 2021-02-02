package com.nt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bDart")
//@Scope("prototype")
public class Bluedart implements ICourier {

	public Bluedart() {
		System.out.println("Bluedart : 0 param constructor");
	}

	@Override
	public String deliver(int oid) {

		return "Delivering(Bluedart) products  having " + oid + "order id";
	}

}
