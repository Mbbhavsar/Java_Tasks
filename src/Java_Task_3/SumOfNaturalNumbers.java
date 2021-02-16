package Java_Task_3;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any natural number : ");
		
		int number = sc.nextInt();
		
		int count=1;
		int sum=0;
		
		while(count<=number) {
			
			sum += count;
			count++;
		}
		
		System.out.println("The sum of first "+number+" natural numbers is "+sum);
		

	}

}
