package com.java.programpack;

public class P000_InstanceControlFlow {
	
	public static void main(String[] args) {
		P000_InstanceControlFlow ob = new P000_InstanceControlFlow();
		ob.InstanceMethod1();
	}
	int a = 1;

	{
		System.out.println(a);
	}
	P000_InstanceControlFlow(){
		System.out.println("a is " +a);

	}
	
	public void InstanceMethod1() {
		String name = "Instance Block Control flow";
		System.out.println(name);
	}
	int b = 2;
	int c = a+b;
	{
		System.out.println("b is " + b);
		System.out.println("c is " +c);

	}

	

}
