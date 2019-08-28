package com.draper;

/**
 * @author draper_hxy
 */
public class E27 {

    static int[] testCase1 = {3, 2, 2, 3};
    static int[] testCase2 = {0, 1, 2, 2, 3, 0, 4, 2};

    public static void main(String[] args) {
        System.out.println(removeElement(testCase1, 3));
        System.out.println(removeElement(testCase2, 2));
    }

    public static int removeElement(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }

        }
        return i;
    }

}
