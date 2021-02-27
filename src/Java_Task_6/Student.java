package Java_Task_6;

public class Student {

	public static void main(String[] args) {

		StudentClass s1 = new StudentClass();
		StudentClass s2 = new StudentClass("Mehul");

	}
}

class StudentClass {

	String name;

	StudentClass() {

		this.name = "Unknown";
		System.out.println("Unknown");
	}

	StudentClass(String a) {

		this.name = a;
		System.out.println("Name of the Student is " + a);

	}

}
