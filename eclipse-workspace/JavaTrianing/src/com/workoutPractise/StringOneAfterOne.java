package com.workoutPractise;

import java.util.Scanner;

public class StringOneAfterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input =Allavudhin
		//output =Alvdi
		String name ;
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("Enter the String");
		 * name =s.nextLine(); String arr[]=name.split(""); String res=""; for(int
		 * i=0;i<arr.length;) { char ch = arr[i].charAt(0); String n
		 * =String.valueOf(ch); res=res+n; i=i+2; } System.out.println(res);
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		name =s.nextLine();
		String name1[] =name.split("");
		for(int i=0;i<name1.length;) {
			char ch =name1[i].charAt(0);
			String nam = String.valueOf(ch);
			System.out.print(nam);
			i=i+2;
		}
	}

	

}
