package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.List;

import com.cisco.prj.entity.Product;

public class ListCovariantExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer")); // supports duplicate elements

		List<Integer> iList = new ArrayList<>();
		iList.add(45);
		iList.add(35);
		iList.add(12);
		
		List<String> sList = new ArrayList<>();
		sList.add("one");
		sList.add("two");
		
		print(iList);
		print(sList);
		print(products);
		
		List<Integer> destIList = new ArrayList<>();
		List<String> destSList = new ArrayList<>();
		
		copy(destIList, iList);
		copy(destSList, sList);
		
		System.out.println(destIList);
		System.out.println(destSList);
	}
	
	// PECS ==> Producer Extends Consumer Super
	private static <T> void copy(List<? super T> destList , List<? extends T> srcList) {
		for(T src : srcList) {
			destList.add(src);
		}
	}
	
//	private static <T> void copy(List<T> destList , List<T> srcList) {
//		for(T src : srcList) {
//			destList.add(src);
//		}
//	}


	// ? allows fetch and prevents mutation 
	private  static  void print(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

//	private  static <T> void print(List<T> list) {
//		for(T obj : list) {
//			System.out.println(obj);
//		}
//	}
}
