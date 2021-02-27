package Java_Task_6;

public class SavingsBox {

	public static void main(String[] args) {
		
		AddAmount a1 = new AddAmount();
		AddAmount a2 = new AddAmount(500);
		
		a1.transaction();
		a2.transaction();
		a2.FinalAmount();
		
		

	}

}

class AddAmount{
	
	int amount = 0 ;
	int a = 0;
	
	AddAmount(){
		
		this.amount = 50;
	}
	
	AddAmount(int x){
		
		this.amount = this.amount + x;
		
		a=a+1;
	}
	
	void transaction() {
		
		System.out.println("Total transactions took placed are = " + a);
	}
	
	void FinalAmount() {
		
		System.out.println("Final amount is = " + this.amount);
	}
}