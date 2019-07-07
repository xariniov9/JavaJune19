package twelthLecture;

import eleventhLecture.LinkedList;

public class Class1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		LinkedList<Integer> lList = new LinkedList<>();
		for(int i=1; i<=5; i++) {
			lList.addAtEnd(i);
		}
		
		lList.print();
		
		try {
			lList.removeLast();
			lList.removeFirst();
		} catch(NullPointerException e) {
			System.out.println("Null Pointer");
		}
		catch (Exception e) {
			System.out.println("General Exception");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("inside finally!");
		}
		//lList.removeLast();
		lList.print();
		
	}

}









