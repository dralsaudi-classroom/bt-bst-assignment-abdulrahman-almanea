package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
        if (bt.empty()) {
            return 0;
        }

        int count = 0;
        Stack<BTNode<T>> stack = new Stack<>();
        stack.push(bt.root);

        while (!stack.isEmpty()) {
            BTNode<T> current = stack.pop();
            bt.current = current; 
            if (bt.isLeaf()) {
                count++;
            }
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return count;
    }
}
