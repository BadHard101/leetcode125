package org.example;

public class Main {
    public static boolean isPalindrome(String s) {
        if (s.length() < 2 || s.isBlank()) return true;
        s = s.toLowerCase();
        int left, right;
        left = 0;
        right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (left > right) return true;
            if (s.charAt(left) != s.charAt(right)) break;
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