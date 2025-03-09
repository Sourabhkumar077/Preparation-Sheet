/*
 * Checking for a Repeated Substring in a String
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to check if a substring is repeated within a given string.
Example:
Input: string = "abab"
Output: True
Explanation: The substring "ab" is repeated.


 */
public class Problem32 {
    public static void main(String[] args) {
        String string = "abab";
        boolean repeated = hasRepeatedSubstring(string);
        System.out.println(repeated);
    }

    public static boolean hasRepeatedSubstring(String string) {
        for (int i = 0; i < string.length() - 1; i++) {
            String substring = string.substring(0, i + 1);
            if (string.indexOf(substring, i + 1) != -1) {
                return true;
            }
        }
        return false;
    }
}