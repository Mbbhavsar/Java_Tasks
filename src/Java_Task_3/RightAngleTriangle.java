package Java_Task_3;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String args[]) {
		
		int row;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows : ");
		
		row= sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(j);
			}

			System.out.println("");
		}
	}

}
