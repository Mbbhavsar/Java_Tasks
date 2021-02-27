package Java_Task_6;

public class Program4 {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle l1 = new Rectangle(6,5);
		Rectangle b1 = new Rectangle(10);

		
		r1.area();
		l1.area();
		b1.area();
		
		
	}

}


class Rectangle{
	
	int length;
	int breadth;
	
	Rectangle(){
		
		this.breadth = 0;
		this.length = 0;
	}
	
	Rectangle(int l,int b){
		
		this.breadth = b;
		this.length = l;
		
	}
	
	Rectangle(int b){
		
		
		this.breadth = b;
		this.length = b;
		
		
	}
	
	void area() {
		
		int area = this.length * this.breadth;
		
		System.out.println("Total Area = "+ area);
	}
	
}