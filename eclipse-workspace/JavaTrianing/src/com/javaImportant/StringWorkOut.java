package com.javaImportant;

public class StringWorkOut {

	public static void main(String[] args) {
		String name = "Django Unchained";
		String name1 = "DjangO Unchained";
		//char s = name.charAt(7);
		//int s = name.codePointAt(7);
		int s = name.compareToIgnoreCase(name1);
		System.out.println(s);

	}

}
