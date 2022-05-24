package com.Practise_program;

import java.util.Scanner;

public class P0029_EachCharacterOccurance {

	public static void main(String[] args) {

		String sentence ="";
		Scanner A = new Scanner(System.in);
		System.out.println("Enter the String ");
		sentence = A.nextLine();
		char word ='a';
		int count = 0;
		int length = sentence.length();
		for( int i=0;i<length;i++) {
			if(sentence.charAt(i)==word) {
				count++;
			}
	}System.out.println(count);

}
}