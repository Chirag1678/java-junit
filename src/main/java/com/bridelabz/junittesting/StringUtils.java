package com.bridelabz.junittesting;

// Class to perform utility functions on Strings
public class StringUtils {
    // method to reverse a string
    public String reverse(String s) {
        StringBuilder reversed = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    // method to check if a String is a palindrome
    public boolean isPalindrome(String s) {
        int start = 0 , end = s.length() - 1;

        while(start<=end) {
            if(s.charAt(start)!=s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // method to convert a String to upperCase
    public String toUpperCase(String s) {
        StringBuilder upperCase = new StringBuilder();

        for(char c: s.toCharArray()) {
            if(c>=97 && c<=122) upperCase.append((char)(c-32));
            else upperCase.append(c);
        }

        return upperCase.toString();
    }
}
