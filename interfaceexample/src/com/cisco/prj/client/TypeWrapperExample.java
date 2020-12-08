package com.cisco.prj.client;

public class TypeWrapperExample {

	public static void main(String[] args) {
		int x = 100; // primitive
		
		Integer iX = x ; // auto boxing
		
		int y = iX ; // unboxing
		
		y++;
		
		System.out.println(y);
	}

}
