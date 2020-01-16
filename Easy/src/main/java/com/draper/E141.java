package com.draper;

import java.util.HashSet;
import java.util.Set;

/**
 * @author draper_hxy
 */
public class E141 {

    Set<String> hashCodeSet = new HashSet<>();

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        if (hashCodeSet.contains(head.next.toString()))
            return true;

        hashCodeSet.add(head.toString());
        return hasCycle(head.next);
    }

}
