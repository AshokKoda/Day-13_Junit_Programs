package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;


public class FindMaxNumTestcase {

	private static final double DELTA = 1e-15;
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
	public void testPassFloat() {
		float a = 15.5f, b = 10.5f, c = 5.0f;
		float result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertNotEquals(10.5, result, DELTA);
	}
	
	@Test
	public void testFail() {
		int a = 15, b = 10, c = 5;
		int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void testFailFloat() {
		float a = 15.5f, b = 10.5f, c = 5.0f;
		float result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertNotEquals(15.5, result, DELTA);
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
	public void testPassFloat2() {
		float a = 15.5f, b = 20.5f, c = 5.0f;
		float result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertNotEquals(10.5, result, DELTA);
	}
	
	@Test
	public void testFail2() {
		int a = 15, b = 20, c = 5;
		int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void testFailFloa2t() {
		float a = 15.5f, b = 20.5f, c = 5.0f;
		float result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertNotEquals(20.5, result, DELTA);
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
	public void testPassFloat3() {
		float a = 15.5f, b = 20.5f, c = 25.0f;
		float result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertNotEquals(10.5, result, DELTA);
	}
	
	@Test
	public void testFail3() {
		int a = 15, b = 20, c = 25;
		int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void testFailFloa3() {
		float a = 15.5f, b = 20.5f, c = 25.0f;
		float result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		Assert.assertNotEquals(25.0, result, DELTA);
	}
	

}
