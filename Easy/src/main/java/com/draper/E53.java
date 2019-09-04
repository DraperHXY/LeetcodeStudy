package com.draper;

/**
 * @author draper_hxy
 */
public class E53 {

    /**
     * 这道题讲道理是有难度的，他们说的动态规划我也没看懂，更别说剩下的分治或者什么
     *
     * 仔细看了看评论区老哥的解释，觉得说的很有道理
     * 1. sum 为负，那就说明在对构成接下来的子序列中，当前 sum 一点用都没有，所以重头计算
     * 2. sum 为正，那就说明对后面的序列会有帮助，所以增加
     *
     * 对于参数
     * 1. 如果参数有正的，那么答案绝对是正的
     * 2. 如果参数全负，那么答案就是负数中最大的那一个
     *
     */
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
