package com.Practise_program;

public class P002_OddEvenArray {
	// find odd and even in the array
	// input {6,4,1,2,3} output should be odd={1,3} even{2,4,6}
	public static void main(String[] args) {
		int arr[] = { 6, 4, 1, 2, 3 };
		System.out.println("FInding the Add and Even From the Input Array");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println("The ODD Number are " + arr[i]);
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 == 0) {
				System.out.println("The Even Number are " + arr[j]);

			}
		}
	}
}
