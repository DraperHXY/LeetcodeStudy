package com.draper;

/**
 * @author draper_hxy
 */
public class E136 {

    public static int singleNumber(int[] nums) {
        int value = 0;
        for (int num : nums) {
            value = value ^ num;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

}
