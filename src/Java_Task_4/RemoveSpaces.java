package Java_Task_4;

public class RemoveSpaces {

	public static void main(String[] args) {

		String str = "My name is Mehul";

		str = str.replaceAll("\\s+", "");

		System.out.println("String after removing spaces --> " + str);

	}

}
