package quest1;

public class Quest1Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] input = {'[', '(', '(', '{', '}', ')', ')', ']', '['};
		
		BalancingBrackets bb = new BalancingBrackets();
		
		for(int i = 0; i < input.length; i++) {
			
			if(input[i] == '(' || input[i] == '{' || input[i] == '[') {
				
				bb.push(input[i]);
				
			} else if(input[i] == ')' || input[i] == '}' || input[i] == ']') {
				
				if( input[i] == bb.reverse(bb.peek()) ) {
					bb.pop();
				} else {
					System.out.println("Unbalanced");
					return;
				}
				
			}
			
		}
		
		if( bb.isEmpty() )
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");

	}

}
