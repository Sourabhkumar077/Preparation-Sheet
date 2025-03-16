/*
 * Finding the Longest Sequence of Consecutive 1s in a Binary Array
Difficulty: Medium
Topics: Arrays, Binary Operations
Description: Write a program to find the longest sequence of consecutive 1s in a binary array.
Example:
Input: array = [1, 1, 0, 1, 1, 1]
Output: 3
Explanation: The longest sequence of 1s is [1, 1, 1] with length 3.
 */
public class Problem30 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
        int maxLength = findLongestSequenceOfConsecutiveOnes(array);
        System.out.println(maxLength);
    }

    // Method to find the longest sequence of consecutive ones in a binary array
    public static int findLongestSequenceOfConsecutiveOnes(int[] array) {
        // Initialize variables to keep track of the maximum length and current length
        int maxLength = 0;
        int currentLength = 0;

        // Iterate over the array
        for (int i = 0; i < array.length; i++) {
            // If the current element is 1
            if (array[i] == 1) {
                // Increment the current length
                currentLength++;
                // Update the maximum length if necessary
                maxLength = Math.max(maxLength, currentLength);
            } else {
                // If the current element is 0, reset the current length
                currentLength = 0;
            }
        }

        // Return the maximum length found
        return maxLength;
    }
}
