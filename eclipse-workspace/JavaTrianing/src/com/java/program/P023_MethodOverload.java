package com.java.program;

public class P023_MethodOverload {
	public int sum(int a , int b) {
		return (a+b);
	}
    public char sum(int  a) {
    	return 'a';
    }

public static void main(String [] Args) {
	P023_MethodOverload obj = new P023_MethodOverload();
	System.out.println(" the one " +obj.sum(1));
	System.out.println(" the two " +obj.sum(10,2));
	
}
}
