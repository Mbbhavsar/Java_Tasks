package Java_Task_5;

import java.util.Arrays;

public class FirstMaxSecondMinArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		int len = arr.length;
		
		Arrays.sort(arr);
		
		int[] arr1 = new int[len];
		
		int max = len-1;
		int min = 0;
		
		for(int i = 0;i<len;i++) {
			
			if(i%2==0) {
				
				arr1[i] = arr[max];
				max--;
			}else {
				
				arr1[i] =arr[min];
				min++;
			}
			
			for(int x : arr1) {
				
				System.out.println(x);
			}
		}
		

	}

}
