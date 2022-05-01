package quest2;

public class Quest2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindSumPair fsp = new FindSumPair();
		
		int[] input = {23, 34, 24, 14, 15, 62, 61};
		int sum = 76;
		
		for(int i=0; i<input.length;i++) {
			fsp.insert(input[i]);
		}
		
		fsp.display();
		
		fsp.inorderList();
		
		System.out.println("By Two pointers method");
		fsp.findPairByTwoPointers(sum);
		
		System.out.println("By set method");
		fsp.findPairByCompliment(sum);
		
		
	}

}
