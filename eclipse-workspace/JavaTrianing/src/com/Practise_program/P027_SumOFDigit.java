package com.Practise_program;

import java.util.Scanner;

public class P027_SumOFDigit {

	public static void main(String[] args) {
	int number;
	int digit;
	int sum= 0;
	Scanner S = new Scanner(System.in);
	System.out.println("Enter the Number");
    number = S.nextInt();
    while(number>0);
    {
    	digit=number%10;
    	sum = sum+digit;
    	number = number/10;
    	
    }
    System.out.println("Sum of Digits" +sum);
    
	}
	}


