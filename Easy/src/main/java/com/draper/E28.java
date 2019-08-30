package com.draper;

import java.util.Arrays;

/**
 * @author draper_hxy
 */
public class E28 {

    private static String haystack1 = "hello", needle1 = "ll";
    private static String haystack2 = "aaaaa", needle2 = "bba";
    private static String haystack3 = null, needle3 = "";
    //    private static String haystack4 = "a", needle4 = "";
    private static String haystack5 = "", needle5 = "";
    private static String haystack6 = "mississippi", needle6 = "mississippi";
    private static String haystack7 = "a", needle7 = "a";

    public static void main(String[] args) {
        System.out.println(strStr(haystack1, needle1));
//        System.out.println(strStr(haystack2, needle2));
//        System.out.println(strStr(haystack3, needle3));
//        System.out.println(strStr(haystack4, needle4));
//        System.out.println(strStr(haystack5, needle5));
//        System.out.println(strStr(haystack6, needle6));
//        System.out.println(strStr(haystack7, needle7));


    }

    public static int strStr0(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) {
                return -1;
            }

            char[] array = haystack.subSequence(i, i + needle.length()).toString().toCharArray();

            int temp = 0;
            for (int i1 = 0; i1 < needle.length(); i1++) {
                if (needle.charAt(i1) != array[i1]) {
                    break;
                }
                temp++;
            }
            if (temp == needle.length()) {
                return i;
            }
        }


        return -1;
    }

    // 别人的方法，感觉
    public static int strStr(String haystack, String needle) {
        int slen = needle.length();
        int blen = haystack.length();

        if (slen > blen) {
            return -1;
        }

        int start = 0;
        int end = slen - 1;

        while (end < blen) {
            if (haystack.substring(start, end + 1).equals(needle)) {
                return start;
            }
            start++;
            end++;
        }

        return -1;

    }
}
