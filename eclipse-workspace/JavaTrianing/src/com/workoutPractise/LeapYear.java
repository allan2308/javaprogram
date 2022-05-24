package com.workoutPractise;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finding an leap year
		// it should div by 4,400 not div by 100
		int year;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year");
		year = s.nextInt();
		if (((year % 4 == 0) && (year % 100!= 0))&& (year%400 == 0)) {
			System.out.println("Its an Leap year");
		} else {
			
			System.out.println("Its Not an Leap year");
		}

	}
}
