package com.Practise_program;

public class P00_FibonacciSeries {
	public static void main(String [] args) {
		//fibonacci series 0 to 100
		// what means 0+1 =1, 1+1 =2, 1+2=3 2+3=5 thats like we need
		//output would be 0 1 1 2 3 5 8 13 21 34
		int count = 100;
		int number1 =0;
		int number2 =1;
		int number3 = 0;
		System.out.println(number1);
		System.out.println(number2);
		int i;
		for(i=2;i<count;i++) {
			number3 = number1+number2;
			if(number3>count)
				break;
			System.out.println(number3);
			number1 = number2;
			number2=number3;
			}
		}
		}
			
		 
	



