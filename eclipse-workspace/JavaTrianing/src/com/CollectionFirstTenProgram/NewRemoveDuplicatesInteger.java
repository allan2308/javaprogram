package com.CollectionFirstTenProgram;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class NewRemoveDuplicatesInteger {
	public static void main(String[] args) {
		Integer[] numbers = {1,2,3,4,2,3,5,1,6};
		List<Integer> li = Arrays.asList(numbers);
		System.out.println(li);
		TreeSet<Integer> tre  = new TreeSet<Integer>(li);
		System.out.println(tre);
		
	}

}
