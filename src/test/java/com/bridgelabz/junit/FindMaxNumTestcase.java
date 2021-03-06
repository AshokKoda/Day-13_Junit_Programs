package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;


public class FindMaxNumTestcase {

	@Test
	public void testPass() {
		int a = 15, b = 10, c = 5;
		int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertEquals(15, result);
	}
	
	@Test
	public void testFail() {
		int a = 15, b = 10, c = 5;
		int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertEquals(10, result);
	}

}
