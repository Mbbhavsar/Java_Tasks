package Java_Task_4;

public class OddEven {

	public static void main(String[] args) {

		// 23,25,75,87,47,1,91,51,2
		// 22,44,64,76,98,12,43,54,90

		//int a[] = { 23, 25, 75, 87, 47, 1, 91, 51, 2 };
		
		int a[] = {22,44,64,76,98,12,43,54,90};
		
		System.out.println("Even Numbers : ");

		for (int i = 0; i < a.length ; i++) {

			if (a[i] % 2 == 0) {

				System.out.println(a[i]);

			}
		}

		System.out.println("Odd Numbers : ");
		
		for(int i = 0; i<a.length ; i++) {
			
			if(a[i] % 2 != 0) {
				
				System.out.println(a[i]);
			}
			
		}
		
		
	}

}
