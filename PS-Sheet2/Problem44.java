/*
 * Checking for Anagram Pairs in a List of Strings
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to find pairs of strings in a list that are anagrams of each other.
Example:
Input: strings = ["listen", "silent", "hello", "world"]
Output: [("listen", "silent")]
Explanation: "listen" and "silent" are anagrams.
 */

import java.util.Arrays;

public class Problem44 {

    public static void main(String[] args) {
        String[] strings = { "listen", "silent", "hello", "world" };
        findAnagramPairs(strings);
    }

    public static void findAnagramPairs(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (isAnagram(strings[i], strings[j])) {
                    System.out.println("(" + strings[i] + ", " + strings[j] + ")");
                }
            }
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

}
