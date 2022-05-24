package com.CollectionFirstTenProgram;

import java.util.Scanner;

public class StringManipulation {
	// string - i love my india
	// output- I Love My India
	public static void main(String[] args) {

		//String name = "i love my india";
		String name;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the String");
		name = n.nextLine();
		String fullName ="";
		String[] arr = name.split(" ");
		// String sc = new String(name);
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i].charAt(0);
			String s = String.valueOf(ch).toUpperCase();
			String sub = arr[i].substring(1);

			//System.out.println(s);
	       fullName = fullName+s+sub+" ";
        
		}
		System.out.print(fullName.trim());
	}
}
