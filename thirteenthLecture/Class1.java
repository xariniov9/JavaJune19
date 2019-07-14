package thirteenthLecture;

public class Class1 {

	public static int [] heap = {5, 13, 10, 3, 8, 12, 5, 3, 2, 17};
	public static int heapSize = heap.length;
	
	public static void heapify(int root) {
		int left = 2 * root + 1;
		int right = 2 * root + 2;
		int largestNode = root;
		
		if(left < heapSize && heap[left] > heap[largestNode]) {
			largestNode = left;
		}
		if(right < heapSize && heap[right] > heap[largestNode]) {
			largestNode = right;
		}
		if(largestNode != root) {
			int temp = heap[largestNode];
			heap[largestNode] = heap[root];
			heap[root] = temp;
			heapify(largestNode);
		}
	}
	
	public static void makeHeap() {
		for(int root= heapSize/2; root>=0; root--) {
			heapify(root);
		}
	}
	
	public static void heapSort() {
		
		while(heapSize > 0) {
			int temp = heap[0];
			heap[0] = heap[heapSize-1];
			heap[heapSize-1] = temp;
			
			heapSize--;
			
			heapify(0);
		}
	}
	
	// TODO: increaseKey(node, val)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeHeap();
		for(int i=0; i<heap.length; i++)
			System.out.print(heap[i] + " ");
		System.out.println();
		heapSort();
		for(int i=0; i<heap.length; i++)
			System.out.print(heap[i] + " ");
		System.out.println();
	}

}
