package com.workoutPractise;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input = 153 (1 cube + 5 cube = 3 cube)=1+125+27=153
		// output=its an armstrong number
		int num;
		int cube = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		num = s.nextInt();
		int temp =num;
		while (num != 0) {
			int num1 = num % 10;// we have the reminder
			cube = (num1 * num1 * num1) + cube;
			num = num / 10;

		}
		//System.out.println("After the calculation of Armstrong  " + cube);
		if (temp==cube){
			System.out.println("Yes Its an Armstrong Number");
		} else {
			System.out.println("Oops Its Not an Armstromg number");
		}
	}

}
