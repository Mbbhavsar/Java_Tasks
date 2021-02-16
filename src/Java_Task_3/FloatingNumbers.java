package Java_Task_3;

import java.util.Scanner;

public class FloatingNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("First Floating Number : ");
		
		double d1 = s.nextDouble();
		

		System.out.println("Second Floating Number : ");
		
		double d2 = s.nextDouble();

		if(Math.abs(d1-d2) <= 0.01) {
			
			System.out.println("These two numbers are same.");
		}else {
			
			System.out.println("These two numbers are different.");

		}

	}

}
