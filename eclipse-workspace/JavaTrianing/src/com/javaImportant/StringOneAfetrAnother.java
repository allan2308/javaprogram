package com.javaImportant;

import java.util.Arrays;

public class StringOneAfetrAnother {

	public static void main(String[] args) {
		// String ="Allavudhin"
		// output="Alvdi"
		String givenName = "Allan";
		String[] arr = givenName.split("");
		String out = "";
		// System.out.println(Arrays.toString(arr));
		System.out.println("The Given String is:" + givenName);

		for (int i = 0; i < arr.length;) {
			char ch = arr[i].charAt(0);
			String s = String.valueOf(ch);
			//System.out.print(s)
			out = out+s;
			i = i + 2;
		}
		System.out.println("The OutPut for the String is:" +out);

	}

}
