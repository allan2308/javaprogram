package com.Practise_program;

import java.util.Scanner;

public class OccuranceCount {
	public static void main(String[] args) {
		String sentence ="";
		Scanner A = new Scanner(System.in);
		System.out.println("Enter the String ");
		sentence = A.nextLine();
		char word ='a';
		int count = 0;
		for( int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==word) {
				count++;
			}
			
		}
		System.out.println(count);
		}
		
		
	

}
