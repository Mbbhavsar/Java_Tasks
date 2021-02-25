package Java_Task_4;


public class LengthOfShortestWord {

	public static void main(String[] args) {
		
	//	String str = "This is a Java Programming";
		
		String str = "Java sessions are good at Consultadd.";
		
		String[] s = str.split(" ");
		
		String shortest = s[0];
		
		
		for(String s1 : s) {
			
			
			if(s1.length()<shortest.length()) {
				
				shortest = s1;
			}
		}
		
		System.out.println("Shortest word = "+shortest);
		System.out.println("Length of the Shortest word = "+shortest.length());

	}

}
