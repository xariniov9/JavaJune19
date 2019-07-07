package twelthLecture;

import eleventhLecture.LinkedList;

public class QueueUsingLinkedList <T extends Comparable<T>> {
	private LinkedList<T> lList;
	
	public QueueUsingLinkedList() {
		lList = new LinkedList<>();
	}
	
	public boolean isEmpty() {
		return lList.isEmpty();
	}
	
	public T Dequeue() throws Exception {
		return lList.removeFirst();
	}
	
	public void Enqueue(T data) {
		lList.addAtEnd(data);
	}
}