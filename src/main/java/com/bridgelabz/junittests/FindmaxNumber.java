package com.bridgelabz.junittests;

public class FindmaxNumber {
	
	public int maxNumAtPositionOne(int a, int b, int c) {
		return c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	}

}
