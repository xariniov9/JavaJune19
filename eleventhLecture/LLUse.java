package eleventhLecture;

// Class to test LL
public class LLUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> lList = new LinkedList<>();
		for(int i =0; i<5; i++) {
			lList.addAtEnd(i);
		}
		
		lList.print();
		
		lList.add(5, 3);
		
		lList.print();
		
		lList.reverseImproved();
		lList.reverse();
		
		lList.print();
		
		lList.addAtBeginning(6);
		lList.addAtEnd(7);
		lList.print();
	}

}
