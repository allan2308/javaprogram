package com.java.programpack;

public class P032_StaticProgram {
	static int a = 10;
	static int d = 45;
	static {
		tell();
	}

	static int b = 29;
	{
		System.out.println(b);
	}

	public static void tell() {
		System.out.println("tell method");

	}

	P032_StaticProgram() {
		int c = a + d;
		System.out.println("c is " + c);

	}

	public static void main(String[] args) {
		tell();

	}

	static int c = 23;
	{
		System.out.println(c);
	}

}
