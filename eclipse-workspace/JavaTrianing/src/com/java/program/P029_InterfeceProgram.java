package com.java.program;
interface Interface1{
	void classes();
	
}
class second implements Interface1{
	public void classes() {
	System.out.println("There Are 10 Classes In One Block");
	}
}
class third implements Interface1{
	public void classes() {	
		System.out.println("There are 12 Classes in one block");
	}
}

public class P029_InterfeceProgram {
	public static void main(String []args) {
		Interface1 obj = new third();
		obj.classes();
		
	}

}
