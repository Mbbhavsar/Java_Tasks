package Java_Task_1;

import java.util.Scanner;


public class PrintByUserAddition {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Choose Two Arithmetic value between 1 to 10 : ");
		
		int a = s.nextInt(10);
		int b = s.nextInt(10);
		
		int z  = a + b;
		
		System.out.println(z+30);

	}

}
