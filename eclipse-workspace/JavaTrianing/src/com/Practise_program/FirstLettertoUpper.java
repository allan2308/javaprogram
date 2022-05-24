package com.Practise_program;

public class FirstLettertoUpper {
	public static void main(String[] args) {
		String s = "aLLANistrytogetgood";
		System.out.println(s);
		 int name = s.length();
		String s1 = s.substring(0,1);
		String s2 = s.substring(1,name);
		 s1 = s1.toUpperCase();
		String s3=s1.concat(s2);
		System.out.println(s3);
		
	}

}
