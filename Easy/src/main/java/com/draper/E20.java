package com.draper;

/**
 * 用 String 模拟栈，效果还挺好
 *
 * @author draper_hxy
 */
public class E20 {

    public static void main(String[] args) {
        System.out.println(isValid("){"));
    }

    public static boolean isValid(String s) {

        if (s == null || s.length() == 1) {
            return false;
        }

        char[][] conditinArray = {
                {'[', ']'},
                {'{', '}'},
                {'(', ')'}
        };

        StringBuilder result = new StringBuilder();
        char[] arrays = s.toCharArray();
        for (int i = 0; i < arrays.length; i++) {

            if (isPop(arrays[i])) {
                if (result.length() - 1 < 0) {
                    return false;
                }

                for (int j = 0; j < conditinArray.length; j++) {
                    if (conditinArray[j][1] == arrays[i]) {
                        if (result.charAt(result.length() - 1) != conditinArray[j][0]) {
                            return false;
                        }
                    }
                }
                result = result.deleteCharAt(result.length() - 1);
            } else {
                result.append(arrays[i]);
            }

        }

        return result == null || result.length() == 0;

    }

    public static boolean isPop(char c) {
        if (c == '[' || c == '{' || c == '(') {
            return false;
        }
        return true;
    }

}
