package org.example;

public class Main {
    public static boolean isPalindrome(String s) {
        if (s.length() < 2 || s.isBlank()) return true;
        String res = new String(s.toLowerCase());
        int left, right;
        left = 0;
        right = res.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(res.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(res.charAt(right))) right--;
            if (left > right) return true;
            if (res.charAt(left) != res.charAt(right)) break;
            left++;
            right--;
        }
        if (left >= right) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("a a"));
    }
}