package com.workoutPractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringArrayAscenRev {
	public static void main(String[] args) {
		String animal[] = { "cat", "mouse", "elephant", "tiger", "lion", "monkey", "cat" };
		/*
		 * System.out.println(Arrays.toString(animal)); Arrays.sort(animal);
		 * System.out.println("After Sort " + Arrays.toString(animal)); List<String> li
		 * = Arrays.asList(animal); Collections.reverse(li);
		 * System.out.println("Afer Rverse" + li); Set<String> set = new
		 * HashSet<String>(li); for (String s : set) { set.toString();
		 * System.out.print(s + " "); }
		 */
		System.out.println(Arrays.toString(animal));
		Arrays.sort(animal);
		System.out.println("After the Sort:  " +(Arrays.toString(animal)));
		List<String> li =Arrays.asList(animal);
		Collections.reverse(li);
		System.out.println("After the Reverse");
		System.out.println(li);
		Set<String> s = new HashSet<String>(li);
		System.out.println("After Using Set");
		for(String set : s) {
			set.toString();
			System.out.print(set + " ");
		}
		
	}

}
