package codeEx2;

import java.util.ArrayList;
import java.util.List;
import codingEx1.Node;

public class LeftViewOfBST {
	  ArrayList<Integer> leftView(Node root)
	    {
	  ArrayList<Integer> res = new ArrayList<>();
	        recursionLeft(root, 0, res);
	        return res;
	    }
	 private void recursionLeft(Node root, int level, ArrayList<Integer> res) {
	        if (root == null) 
	            return;
	        
	        if (res.size() == level) 
	            res.add(root.data);
	        
	        recursionLeft(root.left, level + 1, res);
	        recursionLeft(root.right, level + 1, res);

	}
	 public static void main(String[] args) {
	        // Creating a sample binary tree
	        Node root = new Node(1);
	        root.left = new Node(2);
	        root.left.left = new Node(4);
	        root.left.right = new Node(10);
	        root.left.left.right = new Node(5);
	        root.left.left.right.right = new Node(6);
	        root.right = new Node(3);
	        root.right.right = new Node(10);
	        root.right.left = new Node(9);
	        LeftViewOfBST  solution=new LeftViewOfBST();
	      //  ArrayList<Integer> leftView = solution.leftView(root);	
	      //  for(Integer al: leftView) {
	        //	System.out.println(al);
	        	
	      //  }
	        int t=2;
	        System.out.println(--t);
}
}