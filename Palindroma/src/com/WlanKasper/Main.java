package com.WlanKasper;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindromic("abcaba"));
    }

    public static boolean isPalindromic(String str)
    {
        if (str.isEmpty()){
            return false;
        }else{
            if (str.length() == 1){
                return true;
            }
            else if (str.length() == 2){
                return str.charAt(0) == str.charAt(1);
            }

            return (str.charAt(0) == str.charAt(str.length() - 1)) && isPalindromic(str.substring(1, str.length() - 1));
        }
    }

}
