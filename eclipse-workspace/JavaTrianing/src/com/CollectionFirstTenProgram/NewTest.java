package com.CollectionFirstTenProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NewTest {

	public static void main(String[] args) {
		// value Cat,elephant,dog,tiger and lion
		// sort
		String[] name = { "cat", "elephant", "dog", "tiger", "lion", "cat" };

		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		List<String> li = Arrays.asList(name);
		Collections.reverse(li);
		System.out.println(li);
		LinkedHashSet<String> set = new LinkedHashSet<String>(li);
		for (String s : set) {
			System.out.print(s+" ");
		}

	}
}
