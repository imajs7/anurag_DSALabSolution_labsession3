package quest1;

import java.util.Stack;

public class BalancingBrackets {
	
	private Stack<Character> stack;
	
	BalancingBrackets(){
		stack = new Stack<Character>();
	}
	
	private char reverse(char ch) {
		switch(ch) {
			case '(': return ')';
			case '{': return '}';
			case '[': return ']';
			default: return '-';
		}
	}
	
	public boolean checkingBalance(String input) {
		
		boolean flag = true;
		
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
				
				this.stack.push(input.charAt(i));
				
			} else if(input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']') {
				
				if( input.charAt(i) == reverse( peek() ) ) {
					this.stack.pop();
				} else {
					flag = false;
				}
				
			}
			
		}
		
		flag = flag && this.stack.isEmpty();
		
		return flag;
	}
	
	private char peek() {
		if( this.stack.isEmpty() )
			return '-';
		return this.stack.peek();
	}

}
