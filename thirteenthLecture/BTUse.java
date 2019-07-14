package thirteenthLecture;

import java.util.Arrays;

import eleventhLecture.Pair;

public class BTUse {

	public static int height(BTNode<Integer> node) {
		if(node == null || (node.left == null && node.right == null))
			return 0;
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public static int numNodes(BTNode<Integer> node) {
		if(node == null)
			return 0;
		return numNodes(node.left) + numNodes(node.right) + 1;
	}
	
	public static int max(BTNode<Integer> node) {
		if(node == null)
			return -1000000000;
		if(node.left == null && node.right == null)
			return node.data;
		int maxFromChild = Math.max(max(node.left), max(node.right));
		return Math.max(node.data,  maxFromChild);
	}
	
	public static Pair<Integer, Integer> top2(BTNode<Integer> node) {
		if(node == null) {
			Pair<Integer, Integer> ans = new Pair<>();
			ans.first = -1000000000;
			ans.second = -1000000000;
			return ans;
		}
		
		Pair<Integer, Integer> ans = new Pair<>();
		Pair<Integer, Integer> leftAns = top2(node.left);

		Pair<Integer, Integer> rightAns = top2(node.right);
		int [] arr = new int[5];
		arr[0] = node.data;
		arr[1] = leftAns.first;
		arr[2] = leftAns.second;
		arr[3] = rightAns.first;
		arr[4] = rightAns.second;

		Arrays.sort(arr);
		ans.first = (arr[4]);
		ans.second = arr[3];
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode<Integer> root = new BTNode<Integer>(0);
		root.left = new BTNode<>(1);
		root.right = new BTNode<>(2);
		root.left.left = new BTNode<>(3);
		root.right.left = new BTNode<Integer>(4);
		root.right.right = new BTNode<Integer>(6);
		root.right.right.left = new BTNode<Integer>(6);
		
		System.out.println(height(root));
		System.out.println(numNodes(root));
		System.out.println(max(root));
		
		Pair<Integer, Integer> max2 = top2(root);
		System.out.println(max2.first + " " + max2.second);
	}

}




