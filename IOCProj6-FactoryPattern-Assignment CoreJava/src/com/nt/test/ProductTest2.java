package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.ProductFactory;

public class ProductTest2 {

	public static void main(String[] args) {
		Flipkart flipkart = ProductFactory.getInstance("dtdc");
		flipkart.productPickedAt("Delhi", "Hyd");

	}

}
