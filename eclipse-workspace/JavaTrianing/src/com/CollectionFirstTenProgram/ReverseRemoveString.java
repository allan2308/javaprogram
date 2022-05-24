package com.CollectionFirstTenProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class ReverseRemoveString {
	public static void main(String[] args) {
		String s="aabbccdef";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(char c:s.toCharArray())
		{
		    set.add(c);
		}
		System.out.println(set);
		TreeSet<Character> tre = new TreeSet<Character>(set);
		System.out.println(tre.descendingSet());
		

}
}	