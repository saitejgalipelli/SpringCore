package com.nt.comps;

public class BlueDartCourier implements ICourier {
	@Override
	public void packProduct() {
       System.out.println("Your Product is packed");		
	}

	@Override
	public void shipProduct() {
      System.out.println("Your Product is shipped");		
	}

	@Override
	public void generateBill() {
      System.out.println("Your Product Bill is Generated");		
	}

	@Override
	public void deliveryProduct() {
		System.out.println("Your product is Delivered");
	}

	@Override
	public void courierService() {
		System.out.println("Your product is delivered by BlueDartService");
	}


}
