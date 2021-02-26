package Java_Task_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfIntToSpecificTarget {

	//Given an array of Integers, find two numbers such that they add up to a specific target number.

	
		//2,7,11,15 target=9, here count1 + count2 should be 9
		
		public static int[] sum(int[] num,int target) {
			
			Map<Integer,Integer> count1 = new HashMap<>();
			
			for(int i=0;i<num.length;i++) {
				
				count1.put(num[i], i);
			}
			for(int i=0;i<num.length;i++) {
				
				int count2 = target - num[i];
				
				if(count1.containsKey(count2) && count1.get(count2) != i) {
					
					return new int[] {i , count1.get(count2)};
					
				}
				
			}
			
			
			throw new IllegalArgumentException("Pair is not found");
			
			
		}
		
		public static void main(String[] args) {
			
			int[]num = {1,2,4,5,6};
			int target = 6;
			
			System.out.println("Using HashMap" + Arrays.toString(sum(num,target)));
			
			
			
		}

}
