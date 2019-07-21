package fourteenthLecture;
import java.util.*;
import thirteenthLecture.BTNode;

public class Class1 {

	public static void inorder(BTNode<Integer> root) {
		if(root == null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public static void preorder(BTNode<Integer> root) {
		if(root == null)
			return;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(BTNode<Integer> root) {
		if(root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
		
	}
	
	public static void levelOrder(BTNode<Integer> root) {
		
		Queue<BTNode<Integer> > q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			BTNode<Integer> front = q.remove();
			System.out.println(front.data);
			if(front.left != null)
				q.add(front.left);
			if(front.right != null)
				q.add(front.right);
		}
	}
	// TODO alternate levelOrder
	
	public static void insert(BTNode<Integer> root, int val) {
		if(root == null) {
			return;
		}
		if(root.data <= val) {
			if(root.right == null) {
				root.right = new BTNode<Integer>(val);
				return;
			}
			insert(root.right, val);
			return;
		}
		if(root.left == null) {
			root.left = new BTNode<Integer>(val);
			return;
		}
		insert(root.left, val);
	}
	public static boolean isBST(BTNode<Integer> root, int lb, int ub) {
		if(root == null) {
			return true;
		}
		if(root.data < lb || root.data > ub) {
			return false;
		}
		return isBST(root.left, lb, root.data-1) &&
				isBST(root.right, root.data, ub);
	}
	
	public static boolean find(BTNode<Integer> root, int val) {
		if(root == null)
			return false;
		if(root.data == val) return true;
		return find(root.left, val) || find(root.right, val);
	}
	
	// TODO LCA for BST and Binary Tree
	// TODO LCA in log n with preprocessing (DP)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode<Integer> root = new BTNode<Integer>(10);
		root.left = new BTNode<Integer>(7);
		root.left.left = new BTNode<Integer>(5);
		root.left.left.left = new BTNode<Integer>(4);
		root.left.left.left.left = new BTNode<Integer>(2);
		root.left.right = new BTNode<Integer>(8);
		//root.left.right.right = new BTNode<Integer>(11);
		root.right = new BTNode<Integer>(12);
		root.right.right = new BTNode<Integer>(13);	
		
		System.out.println("inorder");
		inorder(root);
		System.out.println("preorder");
		preorder(root);
		System.out.println("postorder");
		postorder(root);
		System.out.println("levelorder");
		levelOrder(root);
		
		insert(root, 11);
		System.out.println();
		levelOrder(root);
		System.out.println();
		inorder(root);
		
		System.out.println(isBST(root, -(1<<28), (1<<28)));
	}
}