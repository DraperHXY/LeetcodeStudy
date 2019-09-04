package com.draper;

/**
 * @author draper_hxy
 */
public class E58 {

    public static int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        if (array.length == 0) {
            return 0;
        }
        return array[array.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

}
