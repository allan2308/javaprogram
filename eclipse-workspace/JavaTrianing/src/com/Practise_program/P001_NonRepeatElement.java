package com.Practise_program;

public class P001_NonRepeatElement {
	public static void main(String[] args) {
		String name = "testing";
		String[] name1 = name.split("");// {'t','e','s','t','i','n','g'}

		for (int i = 0; i < name1.length; i++) {
			boolean A = true;
			for (int j = i + 1; j < name1.length; j++) {

				if (name1[i].equals((name1[j]))) {
					name1[j] = "";
					A = false;
					break;

				}

			}
			if(A==true) {
				System.out.println(name1[i]);
				break;
				
			}

		}
	}
}
