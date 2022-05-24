package com.java.program;

abstract class animal{
	abstract void tell();
}
class Elephant extends animal{
	void tell() {
		System.out.println("Its So Big and fat ");
	}
class mouse	extends animal{
	void tell() {
		System.out.println("Its Small ");
	}
}	
}

public class P028_AbstractProgram {
	public static void main(String [] args) {
		Elephant obj = new Elephant ();
		obj.tell();
		
	}

}
