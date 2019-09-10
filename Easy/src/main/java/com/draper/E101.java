package com.draper;

/**
 * @author draper_hxy
 */
public class E101 {

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || isMirro(root.left, root.right);
    }

    public static boolean isMirro(TreeNode leftNode, TreeNode rightNode) {

        if (leftNode == null && rightNode == null)
            return true;

        if (leftNode == null || rightNode == null)
            return false;

        if (leftNode.val != rightNode.val)
            return false;

        return isMirro(leftNode.left, rightNode.right) && isMirro(leftNode.right, rightNode.left);
    }
}
