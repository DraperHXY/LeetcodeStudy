package com.draper;

import java.util.List;

/**
 * @author draper_hxy
 */
public class E83 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        print(head);
        System.out.println("=>>>>>>>>>>");
        print(deleteDuplicates(head));

    }


    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fNode = head.next;
        ListNode sNode = head;

        while (fNode != null) {
            if (sNode.val == fNode.val) {
                fNode = fNode.next;
                sNode.next = fNode;
            } else {
                fNode = fNode.next;
                sNode = sNode.next;
            }
        }

        return head;
    }

    static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}

