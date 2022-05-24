package com.workoutPractise;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fibonacci Series - 0,1,1,2,3,5,8,13
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		number = s.nextInt();
		int number1 = 0;
		int number2 = 1;
		while (number > 0) {
			int number3 = number1 + number2;
			if (number3 > number)
				break;
			System.out.println(number3);
			number1 = number2;
			number2 = number3;
		}

	}

}
