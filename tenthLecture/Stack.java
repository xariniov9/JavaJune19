package tenthLecture;

public class Stack {
	
	private int [] stkArr;
	private int top;
	private int size;
	
	public Stack(int size) {
		this.size = size;
		stkArr = new int[size];
		top = 0;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public void push(int x) {
		if(top >= size) {
			System.out.println("Stack Overflow");
			return;
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
