package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;


public class FindMaxNumTestcase {

	/*
	 * Max number at 1st position
	 */
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
	
	/*
	 * Max number at 2nd position
	 */
	@Test
	public void testPass2() {
		int a = 15, b = 20, c = 5;
		int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertEquals(20, result);
	}
	
	@Test
	public void testFail2() {
		int a = 15, b = 20, c = 5;
		int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertEquals(10, result);
	}
	
	/*
	 * Max number at 3rd position
	 */
	@Test
	public void testPass3() {
		int a = 15, b = 20, c = 25;
		int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertEquals(25, result);
	}
	
	@Test
	public void testFail3() {
		int a = 15, b = 20, c = 25;
		int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertEquals(10, result);
	}

}
