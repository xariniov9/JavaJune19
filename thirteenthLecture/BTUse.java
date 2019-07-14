package thirteenthLecture;

public class BTUse {

	public static int height(BTNode<Integer> node) {
		if(node == null || (node.left == null && node.right == null))
			return 0;
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode<Integer> root = new BTNode<Integer>(0);
		root.left = new BTNode<>(1);
		root.right = new BTNode<>(2);
		root.left.left = new BTNode<>(3);
		root.right.left = new BTNode<Integer>(4);
		root.right.right = new BTNode<Integer>(5);
		root.right.right.left = new BTNode<Integer>(6);
		
		System.out.println(height(root));
	}

}
