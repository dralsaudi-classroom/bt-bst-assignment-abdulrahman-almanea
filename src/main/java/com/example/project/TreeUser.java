package com.example.project;

public class TreeUser {
   public static <T> int countLeaves(BT<T> bt) {
	   Node<T> root = bt.getRoot();
	   if (root == null){ 
		   return 0;
	   }
	   if (root.isLeaf()) {
		   return 1; 
	   } 
	   return countLeaves(root.getLeftChild()) + countLeaves(root.getRightChild());
    }
}
