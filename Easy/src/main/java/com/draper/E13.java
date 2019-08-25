package com.draper;

/**
 * 对于这道题来说，评论区的说的这句话
 * "这题懂了就非常简单。
 * 首先建立一个HashMap来映射符号和值
 * 然后对字符串从左到右来，
 * 如果当前字符代表的值不小于其右边，就加上该值；否则就减去该值。
 * 以此类推到最左边的数，
 * 最终得到的结果即是答案"
 *
 *
 * @author draper_hxy
 */
public class E13 {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String romanStr) {
        int result = 0;
        for (int i = 0; i < romanStr.length(); i++) {
            switch (romanStr.charAt(i)) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    break;

            }
            if (i != 0) {
                char current = romanStr.charAt(i);
                char before = romanStr.charAt(i - 1);

                if ((current == 'V' || current == 'X') && before == 'I') {
                    result = result - 2;
                } else if ((current == 'L' || current == 'C') && before == 'X') {
                    result = result - 20;
                } else if ((current == 'D' || current == 'M') && before == 'C') {
                    result = result - 200;
                }
            }
        }

        return result;
    }

}
