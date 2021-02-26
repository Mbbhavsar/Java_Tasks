package Java_Task_5;

import java.util.Arrays;

public class LargeMinusSmall {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		System.out.println("Original Array: "+Arrays.toString(arr)); 


		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			
		  if (arr[i] > max)
				max = arr[i];
		  
		  System.out.println("Largest value = "+max);

		   if (arr[i] < min)
				min = arr[i];
		  System.out.println("Smallest value = "+min);


			System.out.println("Difference is" + (max - min));

		}

	}

}
