package Java_Task_3;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		
		int n;
		double sum = 0;
		
		   Scanner sc=new Scanner(System.in);
			 
	       System.out.println("Enter for How many numbers You want to Calculate Average : ");
		   
	       n=sc.nextInt();
	 
	       int a[]=new int[n];
	 
	       System.out.println("Enter   "+n+"  numbers");
	       
	       for( int i =0 ; i<n;i++) {
	    	   
	    	   a[i] = sc.nextInt();
	    	   
	       }
	       for(int i = 0;i<n;i++) {
	    	   
	    	   sum += a[i];
	    	   
	       }
	       System.out.println("Sum for given numbers is "+ sum);

	       System.out.println("Average for given numbers is "+ sum/n);
	 
	}

}
