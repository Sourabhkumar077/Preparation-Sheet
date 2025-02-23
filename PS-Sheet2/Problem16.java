/*
 * Finding the Longest Consecutive Sequence in an Array
Difficulty: Medium
Topics: Arrays, Hashing
Description: Write a program to find the longest sequence of consecutive numbers in an array.
Example:
Input: array = [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive sequence is [1, 2, 3, 4].
 */

 import java.util.Arrays;

 public class Problem16 {
     public static void main(String[] args) {
         int[] array = {100, 4, 200, 1, 3, 2};
         System.out.println(longestConsecutive(array)); // Output: 4
     }
     
     public static int longestConsecutive(int[] nums) {
         if (nums == null || nums.length == 0) {
             return 0;
         }
         
         Arrays.sort(nums);
         int longestStreak = 1;
         int currentStreak = 1;
         
         for (int i = 1; i < nums.length; i++) {
             if (nums[i] != nums[i - 1]) {
                 if (nums[i] == nums[i - 1] + 1) {
                     currentStreak++;
                 } else {
                     longestStreak = Math.max(longestStreak, currentStreak);
                     currentStreak = 1;
                 }
             }
         }
         
         return Math.max(longestStreak, currentStreak);
     }
 }
 
