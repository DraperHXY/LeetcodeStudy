package com.draper;


/**
 * @author draper_hxy
 */
public class E121 {

    public static int maxProfit(int[] prices) {
        Integer max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j >= 0; j--) {
                if ((prices[i] - prices[j]) > max) {
                    max = (prices[i] - prices[j]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2}));
    }

}
