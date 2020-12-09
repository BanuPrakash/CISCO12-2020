package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.cisco.prj.entity.Product;

public class ListExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer")); // supports duplicate elements
		
//		Collections.sort(products);
		
//		Collections.sort(products, (p1,p2) -> p1.getName().compareTo(p2.getName()));
		
		Collections.sort(products, (p1,p2) -> (int) (p1.getPrice() - p2.getPrice()));
		
		for(Product p : products) {
			System.out.println(p);
		}
		
		System.out.println("********");
		
		for(int i = 0; i < products.size(); i++) {
			Product p = products.get(i); // index based
			System.out.println(p);
		}
		
		System.out.println("********");
		
		Iterator<Product> iter = products.iterator();
		while(iter.hasNext()) {
			Product p = iter.next();
			System.out.println(p);
		}
		
	}

}
