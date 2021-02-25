package Java_Task_3;

public class OddIndexUppercase {

	public static void main(String[] args) {

		String s = "mehulbhavsar";

		StringBuffer sb = new StringBuffer();

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			char c = ch[i];

			if (i % 2 != 0) {

				c = Character.toUpperCase(c);
			}

			sb.append(c);

		}

		System.out.println("New Updated String is " + sb.toString());

	}
}