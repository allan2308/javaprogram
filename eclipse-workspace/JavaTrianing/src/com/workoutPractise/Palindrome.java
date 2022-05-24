package com.workoutPractise;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		name = s.nextLine();
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		System.out.println(rev.trim());
		if (name.equals(rev)) {
			System.out.println("The String is Palindrome");
		} else {
			System.out.println("The String is not Palindrome");
		}
	}

}
