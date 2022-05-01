package quest1;

import java.util.Stack;

public class BalancingBrackets {
	
	private Stack<Character> stack;
	
	BalancingBrackets(){
		stack = new Stack<Character>();
	}
	
	public void push(char element) {
		this.stack.push(element);
	}
	
	public Character pop() {
		return this.stack.pop();
	}
	
	public Character peek() {
		return this.stack.peek();
	}
	
	public Character reverse(Character ch) {
		switch(ch) {
			case '(': return ')';
			case '{': return '}';
			case '[': return ']';
			default: return '-';
		}
	}
	
	public boolean isEmpty() {
		if( this.stack.isEmpty() )
			return true;
		return false;
	}

}
