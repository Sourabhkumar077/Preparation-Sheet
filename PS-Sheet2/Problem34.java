/*
 * Finding the Number of Words in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to count the number of words in a given string.
Example:
Input: string = "Hello world"
Output: 2
Explanation: There are 2 words in the string.
 */
public class Problem34 {
    public static void main(String[] args) {
        String string = "Hello world";
        int wordCount = countWords(string);
        System.out.println("\nNumber of Words in given string is : "+wordCount);
    }

    public static int countWords(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
