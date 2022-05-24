package com.Practise_program;

import java.util.Scanner;

public class P001_LeapYear {
	public static void main(String []args) {
	
	//program to find whether the given year is a leap year or not 
	//(get input from user)
	// div by 4 is an Leap year
	int  year;
	Scanner A = new Scanner(System.in);
	System.out.println("Enter the Year to Check");
	year =A.nextInt();
	if (((year % 4 == 0) && (year % 100!= 0)) && (year%400 == 0)) {
		System.out.println(year +  "is an Leap Year");
	}else
	{
		System.out.println(year +  "is not an Leap Year");
	}
	
}

}
