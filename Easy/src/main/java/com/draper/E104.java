package com.draper;

/**
 * @author draper_hxy
 */
public class E104 {

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public int computeDepth(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return 1;
        }

        if (leftNode == null || rightNode == null) {
            if (leftNode == null) {
                return computeDepth(rightNode.left, rightNode.right) + 1;
            } else {
                return computeDepth(leftNode.left, leftNode.right) + 1;
            }
        }

        int leftDepth = computeDepth(leftNode.left, leftNode.right);
        int rightDepth = computeDepth(rightNode.right, rightNode.right);
        return leftDepth >= rightDepth ? leftDepth + 1 : rightDepth + 1;
    }

}


