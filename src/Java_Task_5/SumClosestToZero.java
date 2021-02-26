package Java_Task_5;

public class SumClosestToZero {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,-4,6,7,-2,9,5};
		int len = arr.length;
		int a,b,sum;
		
		if(len<2) {
			
			System.out.println("Invalid Input");
		}
		int min_a_num = 0;
		int min_b_num = 1;
		int min_sum = arr[0] + arr[1];
		
		for(a=0;a<len-1;a++) {
			
			for(b=a+1;b<len;b++) {
				
				sum = arr[a] + arr[b];
				
				if(Math.abs(min_sum)>Math.abs(sum)) {
					
					min_sum = sum;
					min_a_num = a;
					min_b_num = b;
					
				}
			}
			
		}
		System.out.println("Two elements whose sum is minimun are : " + arr[min_a_num] + "and" + arr[min_b_num]);
		

	}

}
