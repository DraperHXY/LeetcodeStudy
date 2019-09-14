package com.draper;

/**
 * @author draper_hxy
 */
public class E110 {

    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }

    int depth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = depth(treeNode.left);
        if (left == -1) {
            return -1;
        }
        int right = depth(treeNode.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) : -1;
    }

}
