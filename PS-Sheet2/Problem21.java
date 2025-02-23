/*
 * Finding the Second Smallest Number in an Array
Difficulty: Easy
Topics: Arrays
Description: Write a program to find the second smallest number in an array.
Example:
Input: array = [12, 13, 1, 10, 34, 1]
Output: 10
Explanation: The second smallest number in the array is 10.
 */

public class Problem21 {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 1};
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("The second smallest number in the array is: " + secondSmallest);
    }
    public static int findSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }
}
