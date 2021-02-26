package Java_Task_5;

public class MovingZeroToEnd {

	public static void main(String[] args) {

		int a[] = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {

				a[count++] = a[i];

			}

		}

		while (count != a.length) { // if count is not equal to length of an array ,then print zero.

			a[count++] = 0;

		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

	}

}
