package tenthLecture;

public class StackUse {

	public static void insertAtBottom(Stack stk, int x) {
		if(stk.isEmpty()) {
			stk.push(x);
			return;
		}
		int topElement = stk.pop();
		insertAtBottom(stk, x);
		stk.push(topElement);
	}
	
	// without using helper!
	public static void reverseStack(Stack stk) {
		if(stk.isEmpty()) {
			return;
		}
		int topElement = stk.pop();
		reverseStack(stk);
		insertAtBottom(stk, topElement);
	}
	
	
	// https://ideone.com/dJ2wZx
	public static void reverseStack(Stack stk, Stack helper) {
		if(stk.isEmpty()) {
			return;
		}
		int topElement = stk.pop();
		reverseStack(stk, helper);
		
		while(!stk.isEmpty()) {
			helper.push(stk.pop());
		}
		stk.push(topElement);
		while(!helper.isEmpty()) {
			stk.push(helper.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk1 = new Stack(10);
		
		for(int i=1; i<=10; i++) {
			stk1.push(i);
		}
		
		reverseStack(stk1, new Stack(10));
		reverseStack(stk1);
		while(stk1.isEmpty() == false) {
			System.out.println(stk1.pop());
		}
		
		stk1.pop();
		stk1.push(100);
		System.out.println(stk1.pop());
		
		StackImproved stk = new StackImproved();
		for(int i=0; i<50; i++) {
			stk.push(i);
		}
		while(!stk.isEmpty()) {
			System.out.println(stk.pop());
		}
		
		System.out.println(StackImproved.initialCapacity);
	}

}
