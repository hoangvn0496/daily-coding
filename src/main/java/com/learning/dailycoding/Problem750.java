package com.learning.dailycoding;

import java.util.Random;

public class Problem750 {

    public TreeNode generate() {
        TreeNode root = new TreeNode(0);
        Random rand = new Random();
        if (rand.nextInt() < 0.5) {
            root.left = generate();
        }
        if (rand.nextInt() < 0.5) {
            root.right = generate();
        }
        return root;
    }
}
