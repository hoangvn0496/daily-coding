package com.dailycoding;

import java.util.LinkedList;
import java.util.Queue;

public class Problem752 {

    public void printLevelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (queue.size() > 0) {
            System.out.println(queue.peek().getVal());
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
    
    public static void main(String[] args) {
        Problem752 p752 = new Problem752();
        p752.printLevelOrder(new TreeNode().initTreeNode());
    }
}
