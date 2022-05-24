package com.Practise_program;

import java.util.Scanner;

public class P00_PalindromeProgram {
 public static void main(String []  arg) {
	 String name ="";
	 String reverse ="";
	 Scanner A = new Scanner(System.in);
	 System.out.println("Enter the String for palindrom");
	 name = A.nextLine();
	 int  length = name.length();
	 for(int i = length-1 ;i>=0;i--)
		 reverse = reverse+ name.charAt(i);
	 if (name.equals(reverse)) {
		 System.out.println("You Entered the palindrome String");
	 }
	 else	
	 { System.out.println("You enter the Non palindrome String");
	 
	 }	 
 }
}
