package Java_Task_5;

public class SecondLargest {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int max;
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			a[i] = a[n];
		}
		max = a[0];
		for (int i = 0; i < n - 1; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Maximum value:" + max);
	}

}
