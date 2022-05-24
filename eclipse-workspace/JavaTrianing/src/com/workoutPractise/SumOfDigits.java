package com.workoutPractise;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to sum");
		int sum = 0;
		number = s.nextInt();
		while (number != 0) {
			int newnum = number % 10;// we get the Remainder
			sum = sum + newnum;
			number = number / 10;// we get the quotient
		}
		System.out.println(sum);
	}
}
