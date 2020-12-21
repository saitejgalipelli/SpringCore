package com.nt.comps;

public class Flipkart {
	
	private ICourier courier;

	public void setCourier(ICourier courier) {
		this.courier = courier;
	}
	public void productPickedAt(String sourcePlace, String destPlace) {
		courier.courierService();
		courier.generateBill();
		courier.packProduct();
		System.out.println("Your Product is packed at: "+sourcePlace);
		courier.shipProduct();
		System.out.println("Your Product is reached at: "+destPlace);
		courier.deliveryProduct();
	}

}
