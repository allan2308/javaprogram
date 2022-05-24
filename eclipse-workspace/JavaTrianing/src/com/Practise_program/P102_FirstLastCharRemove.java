package com.Practise_program;

import java.util.Scanner;

public class P102_FirstLastCharRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String For Remove First And Last Letter");
		name = S.nextLine();
		System.out.println("After removing First & last");
		int len = name.length();
		String s1 = name.substring(1,len-1);
		System.out.println(s1);
	}

}
