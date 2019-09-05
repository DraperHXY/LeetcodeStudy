package com.draper;

/**
 * @author draper_hxy
 */
public class E66 {

    /**
     * 参考了下别人的做法，觉得数组最大一位进一实在巧妙
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        boolean flag = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (flag == true) {
                int bit = digits[i] + 1;
                if (bit == 10) {
                    flag = true;
                    digits[i] = 0;
                } else {
                    flag = false;
                    digits[i] = bit;
                }
            }
            if (i == 0 && digits[i] == 0 && flag == true) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                return result;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        for (int i : plusOne(new int[]{9})) {
            System.out.print(i + " ");
        }
    }

}
