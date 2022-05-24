package com.Practise_program;

import java.util.Arrays;

public class P0028_CommonCharFinding {

	public static void main(String[] args) {
		// String str1 ="testing"
		// string str2 ="software"
		// output = t e s
		String name1 = "testing";
		String name2 = "software";
		char word=' ';
		char ch1[] = name1.toCharArray();
		char ch2[] = name1.toCharArray();
		for (int i = 0; i < name1.length(); i++) {
			for (int j = 0; j < name2.length(); j++) {
		 if (ch1[i]==(ch2[j])) {
				 word = ch1[i];
					
				}
			}
		}System.out.println((word));

	}

}
