package com.Practise_program;

import java.util.Scanner;

public class CountingWords {
	public static void main(String[] args) {
		String sentence ="";
		Scanner A = new Scanner(System.in);
		System.out.println("Enter the String");
		sentence = A.nextLine();
		String[] allWords = sentence.split(" ");
		int length = allWords.length;
		System.out.println("The Number of count in the Sentence is " +length);
	}

}
