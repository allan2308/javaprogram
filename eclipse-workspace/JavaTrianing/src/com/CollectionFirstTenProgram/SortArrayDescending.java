package com.CollectionFirstTenProgram;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SortArrayDescending {

	public static void main(String[] args) {
		// Input[3,4,1,2,5]. —> output [5,4,3,2,1]
		Integer[] numbers = {3,4,1,2,5};
		List<Integer> li = Arrays.asList(numbers);
		TreeSet<Integer> tre = new TreeSet<Integer>(li);
		
		System.out.println("SortArray" + tre);
		tre.descendingSet();
		System.out.println(tre.descendingSet());
		//for(int i=tre.size();i>0;i--) {
		//System.out.print(i +",");
			//List<Integer> li2 =Arrays.asList(i);
			//System.out.print(li2+",");
			//}
		}
		
		}


