package com.javaImportant;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicates {
	//input [3,4,1,2,3,2,1,5] output be = [1,2,3,4,5]
	public static void main(String[] args) {
		Integer[] numbers = {3,4,1,2,3,2,1,5};
        List<Integer> li =Arrays.asList(numbers);
        System.out.println("List Before Removing duplicate " + li);
		TreeSet<Integer> tre=new TreeSet<Integer>(li);
        
		System.out.println("After remove duplicates " +tre);
					
	}		
}




















