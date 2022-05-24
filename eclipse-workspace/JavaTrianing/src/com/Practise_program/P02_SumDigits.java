package com.Practise_program;

import java.util.Scanner;

public class P02_SumDigits {

	public static void main(String[] args) {
	
		int number, digit, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        number = s.nextInt();
        while(number > 0)
        {
            digit = number % 10;//Ex: 1455%10 =5(we get the last number from the digits)
            sum = sum + digit;
            number = number / 10;//1455/10= 145-->will go to while loop	
        }
        System.out.println("Sum of Digits:"+sum);
    }

	}


