package com.Practise_program;

public class P0023_MissingNumberArray {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 5, 8, 42, 0, 12, 9, 2, 10 };
		int small = arr[0];
		int large = arr[0];
		boolean A = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				int number1 = arr[i];
				small = number1;
			}
			if (arr[i] > large) {
				int number2 = arr[i];
				large = number2;

			}
			for (int j = small; j < large; i++) {
				A = false;
				for (int k = 0; i < arr.length; k++) {
					if (i == arr[k]) {
						A = true;
					}
				}
				if (A == true) {
					System.out.println("Missing Number" + i);
				}

			}

		}

	}

}
