package com.CollectionFirstTenProgram;

import java.util.Arrays;
import java.util.Scanner;

//package com.CollectionFirstTenProgram;

public class NewDuplicatesRemove {

	public static void main(String[] args) {
		// duplicate remving from the string
		String name;
		String allword[];
		String result = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		name = s.nextLine();
		int count =0;
		allword = name.split(" ");
		for (int i = 0; i < allword.length; i++) {
			for (int j = i + 1; j < allword.length; j++) {
				if (allword[i].equals(allword[j])) {
					allword[j] = "";
					//count =count+1;
				}
			}//System.out.println(count);
		}
		for (String word : allword) {
			if (word != "") {
				result = result + word + " ";
			}
		}
		System.out.println(result);

	}
}
