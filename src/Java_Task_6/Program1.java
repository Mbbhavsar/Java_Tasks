package Java_Task_6;

import java.util.Scanner;

public class Program1  {

	private int real;

	public static void main(String[] args) {
		
		Complex c1 = new Complex();
		Complex c2 = new Complex();
	
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
	c1.real = sc.nextInt();
	c2.imaginary = sc.nextInt();
	c2.real = sc.nextInt();
	c2.imaginary = sc.nextInt();
	
	c1.add(c1, c2);

		
		
	}	

	}
	class Complex {
		
		int real;
		int imaginary;
		
		void add(Complex a1,Complex a2) {
			
			int y = a1.real+a2.real;
			int z = a1.imaginary+a2.imaginary;
			System.out.println("Addition = " + z+y);
			
		}
		
		
		
	}
	
	
	


