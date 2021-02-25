package Java_Task_3;

public class ReverseString {

	public static void main(String[] args) {
		
		

		// Using StringBuilder Reverse Method

		String s = "Mehul Bhavsar";

		StringBuilder sb = new StringBuilder(s);

		System.out.println(sb.reverse());
		
		

		// Solution 2 Using forloop

		int len = s.length();// 4

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i); // it will start with r
		}
		System.out.println(rev);

	}

}
