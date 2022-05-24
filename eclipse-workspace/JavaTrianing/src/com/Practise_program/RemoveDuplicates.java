package com.Practise_program;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
			String sentence, result = "" ;
			String allWords[];
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter your sentence: "); 
			sentence = sc.nextLine().toLowerCase();  
			
			allWords = sentence.split(" ");
			
			for(int i=0; i<allWords.length; i++) {
				for(int j=i+1; j<allWords.length; j++) {
					if(allWords[i].equals(allWords[j])) {
						allWords[j] = "";
				}
			}
			}
		
			for(String word: allWords) {
				if(word != "") {
					result = result + word + " ";
				}
			}
			System.out.println("\n after removing duplicate words: " + result.trim());

		}

	}
		
