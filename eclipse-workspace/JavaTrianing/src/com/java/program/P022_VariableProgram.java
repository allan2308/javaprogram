package com.java.program;

public class P022_VariableProgram {

	  int Global = 125 ;
	  static  int Local =25 ;
	  
	    public void LocalCall() {
	    	int Global = 30;
	    	int local = 15;
	    	int local2 =30;
	    	int sum = 0;
	    	sum = local + local2+ this.Global;
	    	System.out.println(sum);
	    	System.out.println( Local);
	    }

	public P022_VariableProgram() {
	}

	public static void main(String[] args) {
		
		int localnumber =15;
		
		
		System.out.println(localnumber);
		
		System.out.println();
		
		
	P022_VariableProgram d = new P022_VariableProgram();
	d.LocalCall();
	System.out.println(d.Global);
	
	
	System.out.println("Global");
	
}
}


