package com.Practise_program;

public class PrimeNumber {
	public static void main(String [] arg) {
		int i;
		//boolean A = true;
		int n = 53;
		if(n==0||n==1) {
			System.out.println(n+"is Not a Prime Number");
		}else {
			for(i=2;i<=n;i++) {
				if(n%2==0) {
					System.out.println(n+"is not a Prime number");
					//A=false;
					break;
				}
				else if(n%2!=0) {
					System.out.println(n+"is a Prime number");
					break;
				}
			}
		}}
}