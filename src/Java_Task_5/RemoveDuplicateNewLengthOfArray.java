package Java_Task_5;

public class RemoveDuplicateNewLengthOfArray {

	public static void main(String[] args) {

		int a[] = { 1, 1, 2, 2, 2, 3, 4, 4, 5, 5 };

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i] + "");
		}
		System.out.println("\n the new length of the array is : " + array_sort(a));

	}

	private static int array_sort(int[] a) {

		int j = 1;

		int i = 0;
		for (int inti = 0; i < a.length; i++) {

			if (a[i] != a[j - 1])

				a[j++] = a[i];
		}
		return j;
	}

}
