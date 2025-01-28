/*
 * Finding the Largest Palindrome in a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to find the largest palindrome in a given string.
Example:
Input: string = "babad"
Output: "bab" or "aba"
Explanation: Both "bab" and "aba" are valid palindromes in the string.
 */

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("largest palindrome string  in given string = "+ str+ " is " + findLargestPalindrome(str));

    }

    public static String findLargestPalindrome(String str) {
        String largestPalindrome = "";
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                if (isPalindrome(substr) && substr.length() > maxLength) {
                    largestPalindrome = substr;
                    maxLength = substr.length(); // Update the max length
                }
            }
        }
        return largestPalindrome;
    }

    public static boolean isPalindrome(String str) {
        int st = 0, ed = str.length() - 1;
        while (st < ed) {
            if (str.charAt(st) != str.charAt(ed)) {
                return false;
            }
            st++;
            ed--;
        }
        return true;
    }
}
