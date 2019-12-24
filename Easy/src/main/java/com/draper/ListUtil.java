package com.draper;

import java.util.List;

/**
 * @author draper_hxy
 */
public class ListUtil {

    public static void printList(List list) {
        for (Object o : list) {
            System.out.print(o + "\t");
        }
        System.out.println();
    }

}
