package com.dailycoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Problem748 {

    /**
     * Given the root of a binary tree, return the most frequent subtree sum. If
     * there is a tie, return all the values with the highest frequency in any
     * order.
     *
     * The subtree sum of a node is defined as the sum of all the node values formed
     * 
     */
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> mapSum = new HashMap<>();
        helper(root, mapSum);
        int maxCount = 0;
        for (int key : mapSum.keySet()) {
            if (mapSum.get(key) > maxCount) {
                maxCount = mapSum.get(key);
            }
        }
        List<Integer> lst = new LinkedList<>();
        for (int key : mapSum.keySet()) {
            if (mapSum.get(key) == maxCount) {
                lst.add(key);
            }
        }
        return lst.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int helper(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        int leftValue = helper(root.left, map);
        int rightValue = helper(root.right, map);
        int sum = root.val + leftValue + rightValue;
        Integer currentTotalOfSum = map.get(sum);
        map.put(sum, currentTotalOfSum == null ? 1 : currentTotalOfSum + 1);
        return sum;
    }

    public static void main(String[] args) {
        Problem748 p = new Problem748();
        TreeNode left1 = p.new TreeNode(1, null, null);
        TreeNode right1 = p.new TreeNode(4, null, null);
        TreeNode root1 = p.new TreeNode(5, left1, right1);
        TreeNode root2 = p.new TreeNode(10, null, null);
        TreeNode root = p.new TreeNode(5, root1, root2);
        int[] rs = p.findFrequentTreeSum(root);
        Arrays.stream(rs).forEachOrdered(System.out::println);
    }

}
