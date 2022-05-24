package com.Practise_program;

public class P004_FindingDuplicatesElements {
	public static void main(String[] args) {
		// finding duplicates elements in the array
		// input like {1,2,3,2,3} output ={2,3}
		int arr[] = { 1, 2, 3, 4, 5, 2, 3 };
		System.out.println("finding dupliactes elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);

				}
			}

		}

	}

}
