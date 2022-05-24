package com.CollectionFirstTenProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateCharRemove {

	public static void main(String[] args) {
		// Input = “acbdeacbaec” Output = abc
		String str = "acbdeacbaec";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
		
		set.add(str.charAt(i));
		
		}
		for(Character ch : set) {
			System.out.print(ch);
			
		}	
		
	}

}
