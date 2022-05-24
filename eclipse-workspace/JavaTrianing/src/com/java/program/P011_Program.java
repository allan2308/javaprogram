package com.java.program;

import java.util.Arrays;

public class P011_Program {
	public static void manin(String []args) {

		String []array = new String[10];    // 0 to 9  --> memory {0, 1, 2, ...9}
		System.out.println(Arrays.toString(array));
		array[0] = "";
		System.out.println(array);
		System.out.println(Arrays.toString(array));
	}	

}
