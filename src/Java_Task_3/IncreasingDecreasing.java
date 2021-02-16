package Java_Task_3;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Three numerical values : ");

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a < b && b < c) {

			System.out.println("Increasing");

		} else if (a > b && b > c) {

			System.out.println("Decreasing");
		} else {

			System.out.println("Neither Increasing nor Decreasing");
		}

	}

}
