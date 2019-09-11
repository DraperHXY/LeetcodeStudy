package com.draper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author draper_hxy
 */
public class E109 {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            List<List<Integer>> list = new ArrayList<>();
            return list;
        }

        LinkedList<List<Integer>> result = new LinkedList<>();
        List<TreeNode> treeNodeList = new ArrayList<>();
        treeNodeList.add(root);

        result.addFirst(buildResult(treeNodeList));

        while ((treeNodeList = nextList(treeNodeList)) != null) {
            result.addFirst(buildResult(treeNodeList));
        }
        return result;
    }

    public static List<TreeNode> nextList(List<TreeNode> treeNodeList) {
        if (treeNodeList == null || treeNodeList.size() == 0) {
            return null;
        }
        LinkedList<TreeNode> newList = new LinkedList<>();
        for (TreeNode treeNode : treeNodeList) {
            if (treeNode.left != null) {
                newList.addLast(treeNode.left);
            }
            if (treeNode.right != null) {
                newList.addLast(treeNode.right);
            }
        }
        if (newList.size() == 0) {
            return null;
        }
        return newList;
    }

    public static List<Integer> buildResult(List<TreeNode> list) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (TreeNode treeNode : list) {
            newList.addLast(treeNode.val);
        }
        return newList;
    }
}
