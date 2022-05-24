package com.Practise_program;

public class P001FindingLargeSmallArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finding large and small elements in array 
		int arr[] = {3,2,5,8,42,12,9,2,10};
		int small = arr[0];
		int large = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				int number1 = arr[i];
				small =number1;
			}
			if(arr[i]>large) {
				int number2 =arr[i];
				large=number2;
				
			}
		}
			System.out.println("the Smallest Number is " + small);
			System.out.println("the largest Number is " + large);
		}
		
	
	
		
			
		}
		
		




