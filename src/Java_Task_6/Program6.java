package Java_Task_6;

public class Program6 {

	public static void main(String[] args) {
		
		Programming p1 = new Programming();
		Programming p2 = new Programming("Java");
		
		

	}

}

class Programming{
	
	private String s;
	
	Programming(){
		
		this.s = "I love Programming";
		
		System.out.println(this.s);
		
	}
	
	Programming(String str){
		
		this.s = "I love "+ str;
		
		System.out.println(this.s);
	}
}