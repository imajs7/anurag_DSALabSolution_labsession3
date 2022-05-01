package quest2;

public class Quest2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindSumPair fsp = new FindSumPair();
		
		int[] input = {23, 34, 24, 14, 5, 62};
		int sum = 36;
		
		for(int i=0; i<input.length;i++) {
			fsp.insert(input[i]);
		}
		
		fsp.display();
		
		fsp.inorderList();
		
		fsp.findPair(sum);
		
		//fsp.recursion(sum);
		
		
	}

}
