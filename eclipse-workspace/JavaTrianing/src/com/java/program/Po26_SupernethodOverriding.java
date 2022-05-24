package com.java.program;
class pets{
	String name = "Dog"	;
}
class Pet1 extends	pets { 
	String name = "Cat";
	void Petname() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
 public class Po26_SupernethodOverriding {
 public static void main(String[] args) {
		 Pet1 obj = new Pet1();
		 obj.Petname();
	}
	}
}
