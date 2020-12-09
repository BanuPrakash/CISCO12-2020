package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.cisco.prj.entity.Product;

public class StreamExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		
		products.stream()
			.filter(p -> p.getCategory().equals("computer"))
			.forEach(p -> System.out.println(p));
		
		System.out.println("******");
		
		List<Product> mobiles = products.stream()
				.filter(p -> p.getCategory().equals("mobile"))
				.collect(Collectors.toList());
		
		for(Product p : mobiles) {
			System.out.println(p);
		}
		
		System.out.println("************** MAP *****************");
		
		products.stream()
			.map(p -> p.getName())
			.forEach(str -> System.out.println(str));
		
		System.out.println("****************** MAP Function reference ********");
		
			Function<Product, String> transform = (p) -> p.getName();
			products.stream()
				.map(transform)
				.forEach(System.out::println); // method reference
			
		System.out.println("*********");
		
		products.stream()
        	.filter(p -> p.getCategory().equals("mobile"))
        	.map(p -> p.getName())
        	.forEach(System.out::println);
		
		System.out.println("*************");
		System.out.println("get total price");
		
		double total = products.stream()
					.map(p -> p.getPrice())
					.reduce( 0.0, (p1, p2) -> p1 + p2);
				
		System.out.println(total);
		
		System.out.println("==============");
		
		Map<String, List<Product>> prodMap = products.stream()
				.collect(Collectors.groupingBy(p -> p.getCategory()));
		
		
		prodMap.forEach(( k , v) -> {
			System.out.println("Category :  " + k);
			v.forEach(System.out::println);
		});
	}

}
