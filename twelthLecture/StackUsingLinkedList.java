package twelthLecture;
import eleventhLecture.LinkedList;

public class StackUsingLinkedList <T> {
	private LinkedList<T> lList;
	
	public StackUsingLinkedList() {
		lList = new LinkedList<>();
	}
	
	public boolean isEmpty() {
		return lList.isEmpty();
	}
	
	public void push(T data) {
		lList.addAtBeginning(data);
	}
	
	public T pop() throws Exception{
		return lList.removeFirst();
	}
}
