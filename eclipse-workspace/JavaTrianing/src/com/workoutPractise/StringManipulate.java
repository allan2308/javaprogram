package com.workoutPractise;

import java.util.Scanner;

public class StringManipulate {
	// in = i love my india
	// out = I Love My India

	public static void main(String[] args) {
		String name;
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("Enter the String ");
		 * name = s.nextLine(); String name1[] = name.split(" "); String Fullname = "";
		 * for (int i = 0; i < name1.length; i++) { char ch = name1[i].charAt(0); String
		 * n = String.valueOf(ch).toUpperCase(); String sub = name1[i].substring(1);
		 * Fullname = Fullname + n + sub + " "; } System.out.println(Fullname);
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		name = s.nextLine();
		String res = "";
		String[] name1 = name.split(" ");
		for (int i = 0; i < name1.length; i++) {
			char ch = name1[i].charAt(0);
			String newString = String.valueOf(ch).toUpperCase();
			String sec = name1[i].substring(1);
			res = res + newString + sec+" " ;
		}
		System.out.println(res.trim());

	}
}