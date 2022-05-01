package quest1;

public class Quest1Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "";
		
		BalancingBrackets bb = new BalancingBrackets();
		
		boolean flag = false;
		
		
		flag = bb.checkingBalance(input);
		
		if(flag)
			System.out.println("The Brackets are Balanced");
		else
			System.out.println("The Brackets are Unbalanced");

	}

}
