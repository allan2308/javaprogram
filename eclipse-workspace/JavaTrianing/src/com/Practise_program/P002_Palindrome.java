package com.Practise_program;

import java.util.Scanner;

public class P002_Palindrome {
	// palindrome program
	// input = madam,output=true
	// input =allan,output = false
	public static void main(String[] args) {
		String name = "";
		String reverse="";
		Scanner A = new Scanner(System.in);
		System.out.println("Enter the String to Check Palindrome");
		name = A.nextLine();
		int length = name.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse =reverse+name.charAt(i);
		}
		if (name.equals(reverse)) {
			System.out.println("You Entered the palindrome String");
		} else {
			System.out.println("You enter the Non palindrome String");

		}
	}

}
