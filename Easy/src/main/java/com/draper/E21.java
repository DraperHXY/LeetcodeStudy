package com.draper;

/**
 * @author draper_hxy
 */
public class E21 {

    public static void main(String[] args) {
        ListNode root1 = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        ListNode temp2 = new ListNode(4);
        root1.next = temp1;
        temp1.next = temp2;

        ListNode root2 = new ListNode(1);
        ListNode temp3 = new ListNode(3);
        ListNode temp4 = new ListNode(4);
        root2.next = temp3;
        temp3.next = temp4;

        ListNode node = mergeTwoLists(root1, root2);


    }

    /**
     * 目标是返回较小的那个节点，空除外
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }


}


class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
