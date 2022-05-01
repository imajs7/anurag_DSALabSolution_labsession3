package quest2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
	
	public void findPairByTwoPointers(int sum) {
		findPairByTwoPointers(0, this.arr.size() - 1, sum);
	}
	
	private void findPairByTwoPointers(int start, int end, int sum) {
		
		boolean flag = false;
		
		while(start < end) {
			if(this.arr.get(start) + this.arr.get(end) == sum) {
				System.out.println("Pair : (" + this.arr.get(start) + ", " + this.arr.get(end) + ")");
				start++;
				end--;
				flag = true;
			} else if(this.arr.get(start) + this.arr.get(end) < sum) {
				start++;
			} else {
				end--;
			}			
		}
		
		if(!flag)
			System.out.println("Not found");
		
	}
	
	/* ----------------------------*/
	public void findPairByCompliment(int sum) {
		Set<Integer> set = new HashSet<Integer>();
		boolean flag = false;
		flag = findPairByCompliment(this.root, sum, set, flag);		
		
		if(!flag)
			System.out.println("Not found");
	}
	
	private boolean findPairByCompliment(Node node, int sum, Set<Integer> set, boolean flag) {
		
		if(node == null)
			return flag;
		
		int comp = sum - node.data;
		set.add(node.data);
		
		if( set.contains(comp) ) {
			System.out.println("Pair : (" + comp + ", " + node.data + ")");
			flag = true;
		}
		
		flag = findPairByCompliment(node.left, sum, set, flag);
		flag = findPairByCompliment(node.right, sum, set, flag);
		
		return flag;
		
	}

}
