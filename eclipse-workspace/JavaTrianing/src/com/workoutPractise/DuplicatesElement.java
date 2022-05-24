package com.workoutPractise;

public class DuplicatesElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 45, 6, 1, 2, 2, 3,45 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
					System.out.print(arr[i] + " ");
				}
			}
		}
	}

}
