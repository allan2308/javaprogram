package com.Practise_program;

public class P00_CountingVowels {
	public static void main(String []args) {
	int  count = 0;
	String str = "This Program to show the counts of vowels and the Vowels is Aeiou";
	str = str.toUpperCase();
	
	for(int i=0;i<str.length();i++) 
		
    if(str.charAt(i)== 'A'||str.charAt(i)== 'E'|| str.charAt(i)== 'I'||str.charAt(i)== 'O'||str.charAt(i)== 'U')
    	count++;																									
    System.out.print("Count is  " +count);

}
}