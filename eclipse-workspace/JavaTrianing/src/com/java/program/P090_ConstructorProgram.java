package com.java.program;

public class P090_ConstructorProgram { 

	P090_ConstructorProgram(){
	
		System.out.println("Default Constructor");
	}
	
	P090_ConstructorProgram(int a , int b){
		System.out.println("Two parameter Constructor");
		
	}
	public static void main(String[]  args) {
		P090_ConstructorProgram obj = new	P090_ConstructorProgram();

		P090_ConstructorProgram obj1 = new	P090_ConstructorProgram(10,20);
		System.out.println();
		
	}
	

}
