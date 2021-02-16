package Java_Task_3;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values here : ");

		int count;
		int sum = 0;

		do {

			count = sc.nextInt();
			sum += count;
		} while (sum != 0);

		System.out.println("Sum for given values is : " + sum);

	}

}
