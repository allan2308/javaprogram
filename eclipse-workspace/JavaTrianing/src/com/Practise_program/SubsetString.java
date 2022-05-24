package com.Practise_program;

public class SubsetString {
	public static void main(String[] args) {
		String str = "Automation Testing is a software Testing Technique";
		String substr="Testing";
		int n1= str.length();
		int n2= substr.length();
		System.out.println("The Orginal String  "+str);
		System.out.println("Finding " +substr);
		for(int i=0;i<n1-n2;i++) {
		int j;
		for(j=0;j<n2;j++) {
			if(str.charAt(i+j)!=str.charAt(j)) {
			
				break;
			}
			if(j==n2) {
				System.out.println("the substring is  Present in the string");
			}
			
		
		}
				
	}

}}
