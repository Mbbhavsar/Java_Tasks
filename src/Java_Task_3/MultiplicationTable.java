package Java_Task_3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Choose any number : ");

		int a = s.nextInt();

		int i = 1;

		while (i <= 10) {

			System.out.printf("%d * %d = %d \n", a, i, a * i);

			i++;
		}

	}

}
