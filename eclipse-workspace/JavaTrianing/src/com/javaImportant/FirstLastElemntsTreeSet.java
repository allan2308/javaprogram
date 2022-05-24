package com.javaImportant;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FirstLastElemntsTreeSet {

	public static void main(String[] args) {
		// Taking the first and last elements in the tree set
		TreeSet<String> tre = new TreeSet<String>();
		  tre.add("Red");
		  tre.add("Green");
		  tre.add("Orange");
		  tre.add("White");
		  tre.add("Black");
		  System.out.println("Tree set: ");
		  System.out.println(tre);
		  String first = tre.first();
		  System.out.println("first element is " +first);
		  String Last = tre.last();
		  System.out.println("lAST element is " +Last);
		}
}
		
		
		




