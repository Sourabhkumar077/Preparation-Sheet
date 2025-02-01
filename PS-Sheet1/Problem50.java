
/*
 * Finding the Longest Substring Without Repeating Characters
Difficulty: Medium
Topics: String Manipulation, Sliding Window
Description: Write a program to find the longest substring without repeating characters in a given string.
Example:
Input: string = "abcabcbb"
Output: "abc"
Explanation: The longest substring without repeating characters is "abc".
 */

 import java.util.Scanner;

 public class Problem50 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a String: ");
         String str = sc.nextLine();
         sc.close();
 
         System.out.println("Longest unique substring: " + findUniqueSubstring(str));
     }
 
     public static String findUniqueSubstring(String str) {
         int maxLength = 0;
         String maxSubstr = "";
 
         for (int i = 0; i < str.length(); i++) {
             String subStr = "";
             boolean[] seen = new boolean[128]; // ASCII character set
 
             for (int j = i; j < str.length(); j++) {
                 char ch = str.charAt(j);
                 
                 if (seen[ch]) break; // Stop when a duplicate is found
                 
                 seen[ch] = true;
                 subStr += ch;
 
                 if (subStr.length() > maxLength) {
                     maxLength = subStr.length();
                     maxSubstr = subStr;
                 }
             }
         }
 
         return maxSubstr;
     }
 }
 