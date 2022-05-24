package com.Practise_program;

import java.util.Scanner;

public class Newpalindrome {

	public static void main(String[] args) {

		//input = alla output//alla yes its palindrom
		String name="";
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		System.out.println("enter teh string");
		int length = name.length();
		String rev ="";
		for(int i= length- 1; i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("Yes its an Palindrome");
		}else {
			System.out.println("its not an Palindrom");
		}

	}}
