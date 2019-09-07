package com.draper;

/**
 * @author draper_hxy
 */
public class E69 {

    public static void main(String[] args) {
//        System.out.println(mySqrt(0));
        System.out.println(mySqrt(1));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(5));
        System.out.println(mySqrt(6));
        System.out.println(mySqrt(9));
    }

    // 好用的二分查找模板
    // https://www.liwei.party/2019/06/17/leetcode-solution-new/search-insert-position/
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long left = 0, right = x / 2 + 1;
        while (left < right) {
            long mid = (right + left + 1) >>> 1;

            long square = mid * mid;
            if (square <= x) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return (int) left;
    }

}
