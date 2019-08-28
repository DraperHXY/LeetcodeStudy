package com.draper;

/**
 * @author draper_hxy
 */
public class E26 {

    static int[] testCase1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    static int[] testCase = {1, 1, 2};

    public static void main(String[] args) {
        System.out.println(removeDuplicates(testCase));
//        System.out.println(testCase[6]);
    }


    /**
     * 快慢指针
     */
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


}
