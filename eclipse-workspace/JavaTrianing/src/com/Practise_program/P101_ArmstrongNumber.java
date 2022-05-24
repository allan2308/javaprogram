package com.Practise_program;

import java.util.Scanner;

public class P101_ArmstrongNumber {
	// find the Armstrong Number
	// input =153 ( 153 = 1(cube) + 5(cube) +3(cube) is equal to input(153)
	// output = "its An Armstrong Number";
	public static void main(String[] args) {
		int number;
		int digits;
		int sum=0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Number to Check Armstrong");
		number = S.nextInt();
		int number2=number;
		while(number>0) {
			digits = number%10;
			sum = sum + digits * digits * digits;
			number = number / 10;
			}
	    if(number2==sum) {
	    	System.out.println("Its An Armstrong Number");
	    }
	    else 
	    {
	    	System.out.println("Its not an Armstrong Number");
	    }
	  	
			
		}

}
