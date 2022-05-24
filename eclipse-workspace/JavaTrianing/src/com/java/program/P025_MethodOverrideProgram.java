package com.java.program;

public class P025_MethodOverrideProgram {
  
		void Text() {
			System.out.println("print the statement");
		}
		int sum(){
			System.out.println("The Sum Operation will perform");
		}
	 }
		 class B extends P025_MethodOverrideProgram{
			int sum() {
				System.out.println("the sum will not perform");
		}
		public static void main(String[] args){
			B obj = new B();
			obj.sum();
		
		}
	}


