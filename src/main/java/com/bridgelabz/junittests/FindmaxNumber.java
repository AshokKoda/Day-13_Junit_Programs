package com.bridgelabz.junittests;

import java.util.Scanner;

public class FindmaxNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer a, b, c;
		System.out.println("Enter A value: ");
		a = sc.nextInt();
		System.out.println("Enter B value: ");
		b = sc.nextInt();
		System.out.println("Enter C value: ");
		c = sc.nextInt();
		
		System.out.println(a.compareTo(b) + " is the maximum number.");
		System.out.println(b.compareTo(a) + " is the maximum number.");
		System.out.println(b.compareTo(c) + " is the maximum number.");
		System.out.println(c + " is the maximum number.");

	}

}
