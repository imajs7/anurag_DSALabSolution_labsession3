package quest2;

import java.util.ArrayList;

public class FindSumPair {
	
	Node root;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	FindSumPair(){
		this.root = null;
	}
	
	public void insert(int data) {
		this.root = insert(this.root, data);
	}

	private Node insert(Node node, int data) {
		
		if(node == null) {
			Node newnode = new Node(data);
			return newnode;
		}
		
		if(data < node.data) {
			node.left = insert(node.left, data);
		} else if(data > node.data) {
			node.right = insert(node.right, data);
		}
		
		return node;
	}
	
	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		
		// base case
		if(node == null)
			return;
		
		// print self
		String leftChild, rightChild;
		
		if(node.left == null)
			leftChild = "X";
		else
			leftChild = node.left.data + "";
		
		if(node.right == null)
			rightChild = "X";
		else
			rightChild = node.right.data + "";
		
		System.out.println(leftChild + " <- " + node.data + " -> " + rightChild);
		
		// call recursion
		display(node.left);
		display(node.right);
		
	}
	
	public void inorderList() {
		inorderList(this.root);
	}
	
	private void inorderList(Node node) {
		if(node != null) {
			inorderList(node.left);
			this.arr.add(node.data);
			inorderList(node.right);
		}
	}
	
	public int getValue(int index) {
		return this.arr.get(index);
	}
	
	public void findPair(int sum) {
		findPair(0, this.arr.size() - 1, sum);
	}
	
	private void findPair(int start, int end, int sum) {
		while(start < end) {
			if(this.arr.get(start) + this.arr.get(end) == sum) {
				System.out.println(this.arr.get(start) + ", " + this.arr.get(end));
				return;
			} else if(this.arr.get(start) + this.arr.get(end) < sum) {
				start++;
			} else {
				end--;
			}			
		}
		System.out.println("Not found");
	}
	
	/* ----------------------------*/
	public void recursion(int sum) {
		recursion(this.root, sum);
	}
	
	private int recursion(Node node, int sum) {
		if(node == null)
			return 0;
		
		if(recursion(node.left, sum) + node.data == sum) {
			System.out.println("Sum = " + sum);
			System.out.println("Pair is: (" + node.data + ", " + node.left.data + ")");
		}

		if(recursion(node.right, sum) + node.data == sum) {
			System.out.println("Sum = " + sum);
			System.out.println("Pair is: (" + node.data + ", " + node.right.data + ")");
		}
		
		return node.data;
		
	}

}
