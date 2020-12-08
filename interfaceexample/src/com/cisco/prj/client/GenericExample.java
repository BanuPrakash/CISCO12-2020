package com.cisco.prj.client;

import java.util.Date;

import com.cisco.prj.entity.Product;

class Example implements Comparable<Product> {

	@Override
	public int compareTo(Product o) {
		return 0;
	}
	
}

interface Sample<T> {
	void doTask(T obj);
}

class One implements Sample<String> {

	@Override
	public void doTask(String obj) {
	}
}

class Two implements Sample<Date> {

	@Override
	public void doTask(Date obj) {
		
	}
}
public class GenericExample {

	public static void main(String[] args) {

	}

}
