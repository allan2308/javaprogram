package com.javaImportant;

public class Fibonacci {
	public static void main(String[] args) {
		// fibonacci series 0 to 100
		// what means 0+1 =1, 1+1 =2, 1+2=3 2+3=5 thats like we need
		// output would be 0 1 1 2 3 5 8 13 21 34
		int number1 = 0;
		int number2 = 1;
		int num;
		int count = 100;
		System.out.println(number1);

		for (int i = 1; i < count; i++) {
			num = number1 + number2;
			if (count < num)
				break;
			System.out.println(num);
			number1 = number2;
			number2 = num;

		}
	}

}
