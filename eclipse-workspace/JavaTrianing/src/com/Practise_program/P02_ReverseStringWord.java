package com.Practise_program;

public class P02_ReverseStringWord {
	public static void main(String[] args) {
		String name="software testing is a testing process";
		 String[] input = name.split(" ");
		 String reverseWord=""; 
		 for(int i=0;i<input.length;i++) {
			 StringBuffer sb = new StringBuffer(input[i]);
			 reverseWord=reverseWord+" " +sb.reverse();
			 
		 }
			System.out.println(reverseWord.trim()); 
		 }
		
			
	
	
	}


