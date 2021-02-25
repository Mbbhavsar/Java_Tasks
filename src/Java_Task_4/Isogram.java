package Java_Task_4;

import java.util.Arrays;

public class Isogram {

	public static void main(String[] args) {

		System.out.println(isIsogram("few"));

	}

	public static boolean isIsogram(String str) {

		str = str.toLowerCase();
		
		int length = str.length();

		char arr[] = str.toCharArray();

		Arrays.sort(arr);

		for (int i = 0; i < length - 1; i++) {

			if (arr[i] == arr[i + 1]) {

				return false;
			}

		}
		return true;

	}

}
