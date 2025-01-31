/*
 * Finding the Average of Numbers in an Array
Difficulty: Easy
Topics: Arrays, Mathematical Computations
Description: Write a program to calculate the average of numbers in an array.
Example:
Input: array = [1, 2, 3, 4, 5]
Output: 3
Explanation: The average of the numbers is (1 + 2 + 3 + 4 + 5) / 5 = 3.
 */
public class Problem44 {
    public static void main(String[] args) {
        // also we can take array elemnts from user input
        int arr[] = {1, 2, 3, 4, 5};
        int length = arr.length;
        System.out.println("Average of the numbers is : " + findAverage(arr, length));
    }
    public static int findAverage(int arr[], int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return sum / length;
    }
}
