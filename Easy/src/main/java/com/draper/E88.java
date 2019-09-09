package com.draper;

/**
 * @author draper_hxy
 */
public class E88 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.print(i + "\t");
        }


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        /**
         * 如果 p1 到头了，p2 还没结束，那么 p2 剩下的直接 copy 过来
         * 如果 p2 到头了，p1 还没结束，那么 p1 原本就是有序的，不用 copy
         */
        while (p1 >= 0 && p2 >= 0)
            nums1[p--] = nums1[p1] >= nums2[p2] ? nums1[p1--] : nums2[p2--];

        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

    }
}
