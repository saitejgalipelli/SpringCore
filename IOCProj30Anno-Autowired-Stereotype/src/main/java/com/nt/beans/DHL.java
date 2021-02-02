package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dhl")
@Primary
//@Scope("prototype")
public class DHL implements ICourier {

	public DHL() {
		System.out.println("DHL : 0 param constructor");
	}

	@Override
	public String deliver(int oid) {

		return "Delivering(DHL) products  having " + oid + "order id";
	}

}
