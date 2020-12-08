package com.cisco.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilityTest {

	@Test
	public void testGetSum() {
		int[] data = {5,6,2};
		int expected = 13;
		assertEquals( expected, Utility.getSum(data));
	}

	@Test
	public void testSort() {
		 int[] data = {5,2,9,1,30,20};
		 Utility.sort(data);
		 int[] expected = {1,2,5,9,20,30};
		 assertArrayEquals(expected, data);
	}

	@Test
	public void testGetOccurence() {
		int[] data = {5,1,2,5,7,5};
		int expected = 3;
		assertEquals( expected, Utility.getOccurence(data, 5));
	}

}
