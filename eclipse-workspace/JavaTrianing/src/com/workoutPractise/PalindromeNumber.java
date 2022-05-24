package com.workoutPractise;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// palindrome
		// input = 0000
		// output =0000

		int num;
		int res = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for Palindrome");
		num = s.nextInt();
		while (num != 0) {
			int num1 = num % 10;
			res = (res * 10) + num1;
			num = num / 10;

		}
		System.out.println(res);
		if (num == res) {
			System.out.println("its an palindrome");
		} else
			System.out.println("its not an palindrome");

	}
}