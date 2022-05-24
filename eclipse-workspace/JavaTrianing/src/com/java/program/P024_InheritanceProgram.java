package com.java.program;

 class P024_InheritanceProgram {

 
		float MySalary = 45825;
		
	}
 class Bonus extends	P024_InheritanceProgram
	{	
		int bonus = 5500;
		public static void main(String []args) {
		Bonus obj = new Bonus();
		System.out.println("My Actual Salary for the Month"+ (obj.MySalary));
		System.out.println("My  Bonus for the Month"+(obj.bonus));
		
	}

}