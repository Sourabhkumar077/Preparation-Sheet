/*
 * Finding the Median of an Array
Difficulty: Medium
Topics: Arrays, Sorting
Description: Write a program to find the median of an array of numbers.
Example:
Input: array = [3, 1, 2, 4, 5]
Output: 3
Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3.
 */

public class Problem32 {
   public static void main(String[] args) {
    int arr[]  = {1,2,3,4,5,};
    int median = findMedian(arr);
    System.out.println("Median of the array is : " + median);
    }
    public static int findMedian(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        if (n % 2 == 0) {
            return (arr[mid - 1] + arr[mid]) / 2;
        } else {
            return arr[mid];
        }
    }
}
