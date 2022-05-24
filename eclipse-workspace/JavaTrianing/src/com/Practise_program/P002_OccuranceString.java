package com.Practise_program;

import java.util.Arrays;

public class P002_OccuranceString {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String [] args) {
		//Occurrence of Words in a String, 
		//input =“Software testing is a testing process”
		//word = “testing”, output should be 2 
		
   String name = "Software testing is a testing process";
   String[] name2 =name.split(" ");
   String word ="testing";
   //System.out.println(Arrays.toString(name2));

   int count = 0;
    for(int i=0;i<name2.length;i++) {
    
    		if(name2[i].equals(word)) {
    			count++;
    		}
    	}
    System.out.println(count);
    }
	
	}
    
 
	


