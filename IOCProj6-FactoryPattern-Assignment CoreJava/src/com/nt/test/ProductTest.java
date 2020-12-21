package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.ProductFactory;

public class ProductTest {

	public static void main(String[] args) {
		Flipkart flipkart = ProductFactory.getInstance("ekart");
		flipkart.productPickedAt("Delhi", "Hyd");
		

	}

}
