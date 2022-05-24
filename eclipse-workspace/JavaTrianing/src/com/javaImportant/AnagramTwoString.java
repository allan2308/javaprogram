package com.javaImportant;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class AnagramTwoString {

	public static void main(String[] args) {
		// Input1 = listen, input2 = silent, output true
		String str1 ="listen";
		String str2 = "silent";
		if (str1.length() != str2.length()) {  
			System.out.println("Both the strings are not anagram");  
		} 
		else {
			char[] string1 = str1.toCharArray();  
			char[] string2 = str2.toCharArray();   
			Arrays.sort(string1);  
			Arrays.sort(string2);  
			if(Arrays.equals(string1, string2) == true) {  
				System.out.println("true");  
			}  
			else {  
				System.out.println("false");  

			}
		}
	}}

