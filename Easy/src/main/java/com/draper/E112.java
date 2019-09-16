package com.draper;

/**
 * @author draper_hxy
 */
public class E112 {

    public static void main(String[] args) {
        System.out.println(hasPathSum(TreeUtil.convert(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}), 22));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        sum = sum - root.val;
        if (root.left == null && root.right == null){
            return sum == 0;
        }

        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

}
