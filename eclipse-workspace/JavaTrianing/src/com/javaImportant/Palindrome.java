package com.javaImportant;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// input =alla
		// output = alla
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String for to Check Whether its Palindrome or NOt");
		name = s.nextLine();
		String rev = "";

		int length = name.length();
		for (int i = length - 1; i >= 0; i--) {

			rev = rev+name.charAt(i);

		}
		if (name.equals(rev)) {
			System.out.println("Its an Palindrome");
		} else {
			System.out.println("its not an Palindrome");
		}
	}

}
