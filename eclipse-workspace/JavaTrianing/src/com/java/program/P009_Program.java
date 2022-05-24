package com.java.program;

import java.util.Arrays;

public class P009_Program {
	public static void manin(String []args) {

	String []array = new String[1];    // 0 to 9  --> memory {0, 1, 2, ...9}
	System.out.println(Arrays.toString(array));
	array[0] = "";
	System.out.println(array);
	System.out.println(Arrays.toString(array));
	
	//second way of creating an array
	String []arr2 = {"Hektah","Testing","Course","Java"};  // String []array = new String[4];
	
	// third way
	String []arr3;
	
	
	int []ar;
	int ar1[];
	int [] ar2;
	
int [][]two = new int[2][3]; 
	int len = array.length;
	System.out.println(len);
	
	for(int i =0; i< two.length;i++) {
	System.out.println(Arrays.toString(two[i]));    //{ 0--> {0,1,2}   , 1--> {0,1,2} }
	}
}
}
