package Java_Task_3;

import java.util.Scanner;

public class FindNumberOfDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		long n = s.nextLong();
		int count = 0;
		int sum = 0;
		
		while(n != 0) {
			
			n /= 10;
			
			count++;
			
		}
		System.out.println("Number of digits of given Number is "+count);
		
		for(sum=0 ;n!=0 ;n/=10)
		{
		sum+=n%10;
		}
		
			
		System.out.println("Sum of given digits is "+sum);
		
		
	}
	
}

