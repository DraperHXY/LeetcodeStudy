package com.draper;

/**
 * 看别人用了很多种方法，有一种叫做字典树，可以学习一下...
 *
 * 自己的实现是 横向遍历，感觉速度还行吧..
 * try catch 出来就是最短的
 *
 * @author draper_hxy
 */
public class E14 {

    public static void main(String[] args) {
        String[] testCase = {
                "aa",
                "a"
        };
        System.out.println(longestCommonPrefix(testCase));

    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";

        if (strs.length == 0) {
            return result;
        }

        try {
            char compare;
            for (int i = 0; i < strs[0].length(); i++) {
                compare = strs[0].charAt(i);
                for (int i1 = 0; i1 < strs.length; i1++) {
                    if (compare != strs[i1].charAt(i)) {
                        return result;
                    }
                }
                result += compare;
            }
        } catch (Exception e) {
            return result;
        }

        return result;
    }


}
