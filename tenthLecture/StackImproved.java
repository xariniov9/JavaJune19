package tenthLecture;

public class StackImproved {
	
	private int [] stkArr;
	private int top;
	private int size;
	public static final int initialCapacity = 10;
	
	public StackImproved() {
		stkArr = new int[initialCapacity];
		top = 0;
		size = initialCapacity;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	private void resize() {
		int [] newStkArr = new int[size * 2];
		for(int i=0; i<stkArr.length; i++)
			newStkArr[i] = stkArr[i];
		stkArr = newStkArr;
		size = 2 * size;
	}
	
	public void push(int x) {
		if(top >= size) {
			resize();
		}
		stkArr[top] = x;
		top++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stkArr[--top];
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stkArr[top - 1];
	}
	
}
