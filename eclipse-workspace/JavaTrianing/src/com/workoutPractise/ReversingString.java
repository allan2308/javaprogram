package com.workoutPractise;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reversing the string
		// input = allavudin is a allan
		// output = nalla a si niduvalla
		String name = "allavudhin is a man";
		String name1[] = name.split(" ");
		String revString = "";
		for (int i = 0; i < name1.length; i++) {
			String word = name1[i];
			String rev = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			revString = revString +rev+ " ";
		}
		System.out.print(revString.trim());
	}
}