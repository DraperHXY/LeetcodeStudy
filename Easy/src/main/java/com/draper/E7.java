package com.draper;

/**
 * 1 << 31
 * (1 << 31) - 1
 *
 * @author draper_hxy
 */
public class E7 {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(- 1);
    }

    public static int reverse(int x) {
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        String result = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }

        if (chars[0] == '-') {
            result = result.subSequence(0, result.length() - 1).toString();
            result = '-' + result;
        }

        try {
            return Integer.valueOf(result);
        } catch (Exception e) {
            return 0;
        }
    }
}
