package com.draper;

/**
 * @author draper_hxy
 */
public class E122 {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int price = 0;

        for (int i = 1; i < prices.length; i++) {
            int restPrices = prices[i] - prices[i - 1];

            if (restPrices > 0) {
                price = restPrices + price;
            }
        }

        return price;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

}
