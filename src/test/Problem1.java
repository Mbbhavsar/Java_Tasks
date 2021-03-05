package test;

public class Problem1 {

	public static void main(String[] args) {

		Mehul m = new Mehul();
		m.sum("123", "122");

	}

}

class Mehul {

	String str1 = "123";
	String str2 = "122";

	void sum(String str1, String str2) {

		int  n1 = 0;
		int  n2 = 0;

		int sum = 0;
		String s = "";

		for (char ch : str1.toCharArray()) {

			n1 = Integer.parseInt(str1);

		}

		for (char ch1 : str2.toCharArray()) {

			n2 = Integer.parseInt(str2);
		}

		sum = n1+n2;
		System.out.println(sum);

	}
}