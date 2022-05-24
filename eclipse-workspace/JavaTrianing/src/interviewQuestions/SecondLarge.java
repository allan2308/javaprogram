package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input =[1,3,4,2,1]
		// out=[3]
		// selection sort
		int arr[]= {1232,3432,3434,2156,7523};
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
			System.out.print((arr[i]) + " ");
		int Size = arr.length;
		System.out.println();
		System.out.println("the Second Largest Number in an Array is " + arr[Size - 2]);
	}
}