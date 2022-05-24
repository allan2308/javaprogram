package com.workoutPractise;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// anagram string
		// input = grab
		// output = brag
		String str1 = "Grab";
		String str2 = "Brag";
		String str = str1.toLowerCase();
		String strnew = str2.toLowerCase();
		if (str.length() != strnew.length()) {
			System.out.println("Both String are not an anagram");
		}
		char ch[] = str.toCharArray();
		char ch1[] = strnew.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if (Arrays.toString(ch).equals(Arrays.toString(ch1))) {
			System.out.println("Both Strings Are Anagram");
		} else {
			System.out.println("Both String are not an anagram");
		}
	}

}
