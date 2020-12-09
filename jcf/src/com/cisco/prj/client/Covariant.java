package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Covariant {

	public static void main(String[] args) {
		
		List<String> slist = new ArrayList<>();
		
//		List<Object> olist = slist;
		
		 
		
		Object[] elems = new String[3]; // Covariance
		elems[0] = "Test";
		elems[1] = new Date(); // ArrayStoreException
		
		
	}

}
