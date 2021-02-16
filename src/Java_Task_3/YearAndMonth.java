package Java_Task_3;

import java.util.Scanner;

public class YearAndMonth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");

		System.out.println(" Please Enter a Year : ");

		int month = sc.nextInt();
		int year = sc.nextInt();
		
		

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{
			System.out.println("\n 31 Days in this Month");  	
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
			System.out.println("\n 30 Days in this Month");  	
		}  
		else if ( month == 2 && year%4 == 0)
		{
			System.out.println("February" + year +" has 29 Days.");  	
		} else {
			
			System.out.println("February " + year +" has 28 days.");
		}
		

	}

}
