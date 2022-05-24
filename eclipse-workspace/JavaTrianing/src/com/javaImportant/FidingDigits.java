package com.javaImportant;

import java.util.Scanner;

public class FidingDigits {
	public static void main(String[] args) {
		// FInding the digits
		// eg : 5464
		// output =4
		int number;
		int count=0;
		System.out.println("Enter the Number for find the Digits");
		Scanner a = new Scanner(System.in);
		number = a.nextInt();
		//String num = Integer.toString(number);
		//System.out.println("the Count of the number is" + num.length());
        while(number>0) {
        	int num = number/10;
        	number = num;
        	count++;
        	
        }
       System.out.println("the Count of the Number is  " +count);
	}
}
