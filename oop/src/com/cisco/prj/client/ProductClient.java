package com.cisco.prj.client;

import java.lang.reflect.Method;

import com.cisco.prj.entity.Mobile;
import com.cisco.prj.entity.Product;
import com.cisco.prj.entity.Tv;

public class ProductClient {

	public static void main(String[] args) {
		Product[] products = new Product[5]; // Array of 5 Pointers
		products[0] = new Tv(133, "Sony Bravia", 135000.00, "LED"); // upcasting
		products[1] = new Mobile(453, "MotoG", 12999.00, "4G");
		products[2] = new Tv(634, "Onida Thunder", 3500.00, "CRT");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		products[4] = new Mobile(844, "Oppo", 9999.00, "4G");
		 
//		displayExpensive(products);
//		displayProducts(products);
		displayOCPway(products);
	}

	// OCP way ==> Java Reflection API
	private static void displayOCPway(Product[] products) {
		for (int i = 0; i < products.length; i++) {
			System.out.println("==============");
			 Class clazz = products[i].getClass();
			 Method[] methods = clazz.getMethods(); // class methods + inherited methods
			 for(Method m : methods) {
				 if(m.getName().startsWith("get")) {
					 try {
						 Object ret = m.invoke(products[i]);
						 System.out.println(m.getName().substring(3).toUpperCase() + " : " + ret);
					 } catch(Exception ex) {
						 System.out.println(ex);
					 }
				 }
			 }
			 System.out.println("=============");
		}
	}

	// OCP ==> Closed for Change; open for extension
	private static void displayExpensive(Product[] products) {
		for (int i = 0; i < products.length; i++) {
			if (products[i].isExpensive()) { // dynamic binding ; polymorphism
				System.out.println(products[i].getName() + " is expensive");
			} else {
				System.out.println(products[i].getName() + " is not expensive");
			}
		}
	}

	// Is this method using OCP?
	private static void displayProducts(Product[] products) {
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + ", " + products[i].getPrice());
			if (products[i] instanceof Tv) {
				Tv tv = (Tv) products[i]; // downcasting
				System.out.println(tv.getScreenType());
			} else if (products[i] instanceof Mobile) {
				Mobile m = (Mobile) products[i]; // downcasting
				System.out.println(m.getConnectivty());
			}
			System.out.println("****************");
		}
	}

}
