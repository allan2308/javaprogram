package com.CollectionFirstTenProgram;

import java.util.ArrayList;

public class TraverseArrayList {
     //Traverse ArrayList is Means Add the String
	public static void main(String[] args) {
		ArrayList<String> stu = new ArrayList<String>(); 
		stu.add("rollNo1");
		stu.add("rollNo2");
		stu.add("rollNo3");
		stu.add("rollNo4");
		System.out.println("Students "  + stu);
		//System.out.println("Traverse over ArrayList using for each ");
		System.out.println("Traverse over ArrayList using for loop ");
		for(int i=0;i<stu.size();i++) {
			System.out.print(stu.get(i)+",");
			
		//for(String student: stu) {
			//System.out.print(student);
			//System.out.print(",");
		}
	}

}
