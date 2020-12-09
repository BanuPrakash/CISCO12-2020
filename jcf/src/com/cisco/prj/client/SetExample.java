package com.cisco.prj.client;

import java.util.Set;
import java.util.TreeSet;

import com.cisco.prj.entity.Product;

public class SetExample {

	public static void main(String[] args) {
//		Set<Product> products = new HashSet<>(9); // load factor is 0.7f
//		Set<Product> products = new TreeSet<>(); // RedBlack tree
		Set<Product> products = new TreeSet<>((p1,p2) -> {
			int diff = (int) (p1.getPrice()- p2.getPrice());
			if( diff == 0) {
				diff = p1.getId() - p2.getId();
			}
			return diff;
		});
		products.add(new Product(645, "Hp Laptop", 125000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer")); //  duplicate element
		
		for(Product p : products) {
			System.out.println(p);
		}

	}

}
