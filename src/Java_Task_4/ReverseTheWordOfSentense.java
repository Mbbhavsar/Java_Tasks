package Java_Task_4;

import java.util.Stack;

public class ReverseTheWordOfSentense {

	public static void main(String[] args) {

		String str = "Be happy and stay positive";

		reverseWords(str);

	}

	static void reverseWords(String str) {
		
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < str.length(); ++i) {
			
			if (str.charAt(i) != ' ')
				
				st.push(str.charAt(i));

			// When we see a space, we print
			// contents of stack.
			else {
				
				while (st.empty() == false) {
					
					System.out.print(st.pop());

				}
				System.out.print(" ");
			}
		}

		// Since there may not be space after
		// last word.
		while (st.empty() == false) {
			
			System.out.print(st.pop());

		}
	}

}
