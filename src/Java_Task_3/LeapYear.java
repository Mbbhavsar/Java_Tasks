package Java_Task_3;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any year : ");

		int n = s.nextInt();

		if (n % 4 == 0) {

			System.out.println("It's a Leap Year");
			
		} else {

			System.out.println("It's not a Leap year.");
		}

	}

}
