package codeEx2;
import codingEx1.Node;
public class BST {
	 static int maxValue(Node node)
	 {
	     if (node == null) {
	         return Integer.MIN_VALUE;
	     }
	     int value = node.data;
	     int leftMax = maxValue(node.left);
	     int rightMax = maxValue(node.right);

	     return Math.max(value, Math.max(leftMax, rightMax));
	 }

	;
	 /* Returns true if a binary tree is a binary search tree
	  */
	 static boolean isBST(Node node)
	 {
	     if (node == null) {
	         return true;
	     }
	     if (node.left != null && maxValue(node.left) > node.data) {
	         return false;
	     }
	     if (node.right != null && minValue(node.right) < node.data) {
	         return false;
	     }
	     if (isBST(node.left) == false || isBST(node.right) == false) {
	         return false;
	     }
	     return true;
	 }

	 private static int minValue(Node right) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args)
	 {
	     Node root = new Node(4);
	     root.left = new Node(2);
	     root.right = new Node(5);

	     // root->right->left = newNode(7);
	     root.left.left = new Node(1);
	     root.left.right = new Node(3);

	     // Function call
	     if (isBST(root)) {
	         System.out.print("Is BST");
	     }
	     else {
	         System.out.print("Not a BST");
	     }
	 }
	}