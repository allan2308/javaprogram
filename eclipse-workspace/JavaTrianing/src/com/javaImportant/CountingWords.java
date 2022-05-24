package com.javaImportant;

import java.util.Scanner;

public class CountingWords {
	public static void main(String[] args) {
		// count the number of words in String

		String sentence = "";
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String for Count");
		sentence = a.nextLine();
		String[] name = sentence.split("");
		int CountOfWords = name.length;
		System.out.println("The number of Count in the String is  " + CountOfWords);

	}

}
