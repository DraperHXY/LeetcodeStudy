package com.draper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author draper_hxy
 */
public class E119 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> preList = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            curList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    curList.add(1);
                } else {
                    curList.add(preList.get(j - 1) + preList.get(j));
                }
            }
            preList = curList;
        }

        return curList;
    }

    public static void main(String[] args) {
        ListUtil.printList(getRow(7));
    }

}
