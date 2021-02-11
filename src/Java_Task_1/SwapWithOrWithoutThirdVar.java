package Java_Task_1;

public class SwapWithOrWithoutThirdVar {
	
	

		public static void main(String[] args) {
			
			int x = 5;
			int y = 10;
			
			//Using third VAR t
			
			int t;
			t = x; //5
			x = y; //10
			y = t; //5
			
			//without using third VAR: using  + operator
			
			x = x + y; // 15
			y = x - y; //5
			x = x - y; //10
			
			//without using third VAR : using * operator
			
			x = x * y; //50
			y = x / y; //5
			x = x / y; //10
					
			
			System.out.println(x);
			System.out.println(y);

			

		}

	}



