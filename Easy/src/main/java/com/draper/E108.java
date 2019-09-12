package com.draper;

/**
 * @author draper_hxy
 */
public class E108 {

    public static void main(String[] args) {
        printTree(sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length );

    }

    public static TreeNode buildTree(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }

        int mid = (l + r) >>> 1;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = buildTree(nums, l, mid);
        treeNode.right = buildTree(nums, mid + 1, r);
        return treeNode;
    }

    public static void printTree(TreeNode treeNode) {
        if (treeNode == null) {
            System.out.println("null");
            return;
        }
        System.out.println(treeNode.val);
        printTree(treeNode.left);
        printTree(treeNode.right);
    }

}
