package com.draper;

/**
 * @author draper_hxy
 */
public class E35 {

    public static int[] testCase = {1, 3, 5, 6};

    public static void main(String[] args) {
        System.out.println(searchInsert(testCase, 5));
        System.out.println(searchInsert(testCase, 2));
        System.out.println(searchInsert(testCase, 7));
        System.out.println(searchInsert(testCase, 0));

    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] >= target) {
                return j;
            }

        }
        return nums.length;
    }

}
