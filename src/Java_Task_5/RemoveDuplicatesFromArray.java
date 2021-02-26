package Java_Task_5;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		// Remove duplicates from Unsorted array
		// it will work for sorted array too

		// int[]a = {1,2,3,3,4,5,5,6};

		int[] a = { 1, 2, 2, 5, 3, 4, 5, 8, 9, 3 };

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < a.length; i++) {

			hs.add(a[i]);

		}

		for (int n : hs) {

			System.out.println(n + "");

		}

	}

}
