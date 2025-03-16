/*
 * inding the Largest Sum of a Subarray
Difficulty: Medium
Topics: Arrays, Dynamic Programming
Description: Write a program to find the largest sum of any contiguous subarray.
Example:
Input: array = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The largest sum is 6, from the subarray [4, -1, 2, 1].
 */
public class Problem27 {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = largestSubarraySum(array);
        System.out.println(maxSum);
    }

    // Method to find the largest sum of any contiguous subarray
    public static int largestSubarraySum(int[] arr) {
        // Initialize variables to keep track of the maximum sum and current sum
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the current sum
            currentSum += arr[i];

            // If the current sum is greater than the maximum sum, update the maximum sum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If the current sum is negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Return the maximum sum found
        return maxSum;
    }
}