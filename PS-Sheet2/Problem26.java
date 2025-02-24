
/*
 * Finding the Count of a Specific Word in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to count how many times a specific word appears in a given string.
Example:
Input: string = "hello world hello"
Output: 2
Explanation: The word "hello" appears 2 times in the string.
 */
public class Problem26 {
    public static void main(String[] args) {
        String str = "hello world hello";
        String word = "hello";
        int count = countWord(str, word);
        System.out.println("The word \"" + word + "\" appears " + count + " times in the string."); 
        
    }
    public static int countWord(String str, String word) {
        int count = 0;
        String[] words = str.split(" ");
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
