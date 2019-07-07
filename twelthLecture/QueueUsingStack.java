package twelthLecture;

public class QueueUsingStack <T> {
	private StackUsingLinkedList<T> s1, s2;
	public QueueUsingStack() {
		s1 = new StackUsingLinkedList<>();
		s2 = new StackUsingLinkedList<>();
	}
	
	public T Dequeue() throws Exception{
		return s1.pop();
	}
	
	public void Enqueue(T data) throws Exception {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	public boolean isEmpty() {
		return s1.isEmpty();
	}
}