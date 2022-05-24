package com.Practise_program;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	String name ="";
	String reverse="";
	Scanner A = new Scanner(System.in);
	System.out.println("enter the string for revserse");
	name = A.nextLine();
	int length = name.length();{
	for(int i =length-1;i>=0;i--) {
		reverse = reverse+name.charAt(i);}{	
	System.out.println("the Reverse String is "+reverse);
		}
			
	}}}

