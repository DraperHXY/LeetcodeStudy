package com.draper;

/**
 * @author draper_hxy
 */
public class E70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int[] store = new int[n + 1];
        store[1] = 1;
        store[2] = 2;
        for (int i = 3; i < store.length; i++) {
            store[i] = store[i - 1] + store[i - 2];
        }
        return store[n];
    }

}
