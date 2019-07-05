package eleventhLecture;


//   https://ideone.com/KLmhMW
public class LinkedList <T> {
	
	// nodes are part of linkedlist
	// it does not make sense to make it public
	private class NodeLL <T1> {
		T1 data;
		NodeLL<T1> next;
		
		public NodeLL(T1 data) {
			this.data = data;
			
		}
	}
	
	private NodeLL<T> head;
	private NodeLL<T> tail;
	
	public void addAtBeginning(T data) {
		NodeLL<T> newHead = new NodeLL<T>(data);
		newHead.next = head;
		head = newHead;
		if(tail == null) {
			tail = head;
		}
	}
	
	public void addAtEnd(T data) {
		NodeLL<T> newTail = new NodeLL<>(data);
		if(tail == null ) {
			head = tail = newTail;
			return;
		}
		tail.next = newTail;
		tail = newTail;
	}
	
	
	public void add(T data, int i) {
		if(i==0) {
			addAtBeginning(data);
			return;
		}
		NodeLL<T> temp = head;
		int j = 0;
		while(j < i-1 && temp.next!=null) {
			temp = temp.next;
			j++;
		}
		NodeLL<T> newNode = new NodeLL<>(data);
		if(j==i-1) {
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	private NodeLL<T> reverse(NodeLL<T> head) {
		if(head.next == null || head == null) {
			return head;
		}
		NodeLL<T> newHead = reverse(head.next);
		head.next = null;
		NodeLL<T> itr = newHead;
		while(itr.next != null) {
			itr = itr.next;
		}
		itr.next = head;
		return newHead;
	}
	
	//assume first contains new head and second contains new tail
	private Pair<NodeLL<T>, NodeLL<T>> reverseImproved(NodeLL<T> head) {
		if(head.next == null || head == null) {
			Pair<NodeLL<T>, NodeLL<T>> ans = new Pair<>();
			ans.first = head;
			ans.second = head;
			
			return ans;
		}
		Pair<NodeLL<T>, NodeLL<T>> smallAns = reverseImproved(head.next);
		Pair<NodeLL<T>, NodeLL<T>> ans = new Pair<>();
		head.next = null;

		ans.first = smallAns.first;
		smallAns.second.next = head;
		ans.second = head;
		
		return ans;
	}
	
	public void reverse() {
		tail = head;
		head = reverse(head);
//		NodeLL<T> temp = head;
//		head = tail;
//		tail = temp;
	}
	
	public void reverseImproved() {
		Pair<NodeLL<T>, NodeLL<T>> ans = reverseImproved(head);
		head = ans.first;
		tail = ans.second;
	}
	
	private void print(NodeLL<T> head) {
		if(head == null) {
			System.out.println("null");
			return;
		}
		System.out.print(head.data + "-> ");
		print(head.next);
	}
	
	public void print() {
		System.out.println(head);
		print(head);
	}
}