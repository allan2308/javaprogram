package com.workoutPractise;

import java.util.Arrays;

public class FindingLargeSmallArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input ={2,45,5,3,5,8}
		// small =2
		// large =45

		int arr[] = { 2, 45, 5, 3, 5, 8 };

		System.out.println("the given arrays" + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("We Sorted Array");
		for (int i = 0; i < arr.length; i++) {
		}
		System.out.println(Arrays.toString(arr));
		int size = arr.length;
		System.out.println("The smallest array is " + arr[size - (size - 0)]);
		System.out.println("The Largest array is " + arr[size - 1]);
	}
}
