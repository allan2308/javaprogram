package com.workoutPractise;

import java.util.Arrays;

public class StringArraySortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"ads", "sds", "adn"};
		for(int i=0;i<arr.length;i++);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("After the sort");
		System.out.println(Arrays.toString(arr));
	}}