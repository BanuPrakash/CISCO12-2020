package com.cisco.prj.util;

import java.util.Arrays;

public class Utility {
	public static int getSum(int[] elems) {
		int sum = 0;
		for (int i = 0; i < elems.length; i++) {
			sum += elems[i];
		}
		return sum;
	}
	
	public static void sort(int[] elems) {
		 Arrays.sort(elems);
	}
	
	public static int getOccurence(int[] elems, int no) {
		int occur  = 0;
		for (int i = 0; i < elems.length; i++) {
			if( elems[i] == no) occur++;
		}
		return occur;
	}
 }
