package com.draper;

/**
 * @author draper_hxy
 */
@SuppressWarnings("all")
public class E112 {

    public static void main(String[] args) {
        System.out.println(hasPathSum1(TreeUtil.convert(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}), 22));
        System.out.println(hasPathSum2(TreeUtil.convert(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}), 22));
    }

    public static boolean hasPathSum1(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        sum = sum - root.val;
        if (root.left == null && root.right == null) {
            return sum == 0;
        }

        return hasPathSum1(root.left, sum) || hasPathSum1(root.right, sum);
    }

    public static boolean hasPathSum2(TreeNode root, int sum) {
        return search(root, sum, 0);
    }

    public static boolean search(TreeNode node, int sum, int hasSum) {
        if (node == null) {
            return false;
        }
        hasSum = hasSum + node.val;
        if (node.left == null && node.right == null) {
            return sum == hasSum;
        }
        return search(node.left, sum, hasSum) || search(node.right, sum, hasSum);
    }

}
