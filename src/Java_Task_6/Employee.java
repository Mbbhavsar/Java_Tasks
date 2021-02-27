package Java_Task_6;

public class Employee {
	
	String name;
	int yoj;
	String address;

	public static void main(String[] args) {
		
		
			Employee n1 = new Employee();
			Employee y1 = new Employee();
			Employee a1 = new Employee();
			
			n1.name = "Robert";
			n1.yoj = 1994;
			n1.address = "64C Walls Street";
			
			System.out.println("Name    Year of Joining    Address");
			
			System.out.println(n1.name + "\t" + n1.yoj    +      "\t" + n1.address);
			
		
			y1.name = "Sam";
			y1.yoj = 2000;
			y1.address = "64C Walls Street";
			
			System.out.println(y1.name + "\t" + y1.yoj    +      "\t" + y1.address);

			
			a1.name = "John";
			a1.yoj = 2005;
			a1.address = "64C Walls Street";
			
			
			System.out.println(a1.name + "\t" + a1.yoj     +       "\t" + a1.address);

		
	}

}
