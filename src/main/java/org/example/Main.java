package org.example;

public class Main {
    public static boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        res.append(s.toLowerCase());
        res.trimToSize();
        System.out.println(res);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan,   a canal: Panama"));
    }
}