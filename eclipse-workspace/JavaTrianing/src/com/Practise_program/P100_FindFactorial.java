package com.Practise_program;

import java.util.Scanner;

public class P100_FindFactorial {
	// Finding the factorial for the number
	// input 5 means output be 5*4*3*2*1 = 120;

	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for Factorial");
		number = s.nextInt();
		int count = 1;
		while (number > 0) {
			count = count * number;
			number--;
		}
		System.out.println(count);

	}
	
}
