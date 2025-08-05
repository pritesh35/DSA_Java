package com.pritesh.Lec4;

public class IsStringPalindrome {

    static boolean isit(String s, int i){
        int n = s.length();
        if(i >= n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n - i - 1)){
            return false;
        }
        return isit(s, i + 1);
    }

    public static void main(String[] args) {
        String s = "MADdAM";

        boolean isPalindrome = true;
        System.out.println(isit(s, 0));

    }
}
