package com.draper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author draper_hxy
 */
public class E118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        Integer[] lastArray = {1};


        for (int i = 1; i <= numRows; i++) {
            Integer[] childArray = new Integer[i];
            childArray[0] = lastArray[0];
            childArray[childArray.length - 1] = lastArray[lastArray.length - 1];

            if (i != 1)
                for (int i1 = 1; i1 < childArray.length - 1; i1++) {
                    childArray[i1] = lastArray[i1 - 1] + lastArray[i1];
                }
            list.add(Arrays.asList(childArray));
            lastArray = childArray;
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        for (List<Integer> integerList : list) {
            for (Integer integer : integerList) {
                System.out.print(integer + "\t");
            }
            System.out.println();
        }
    }

}
