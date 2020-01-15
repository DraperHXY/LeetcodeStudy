package com.draper;

/**
 * @author draper_hxy
 */
public class E125 {

    public boolean isPalindrome(String s) {
        if (s.equals("")) {
            return true;
        }
        String ss = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return new StringBuilder(ss).reverse().toString().equals(ss);
    }

}
