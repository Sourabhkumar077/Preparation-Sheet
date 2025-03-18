/*
 * Finding the Difference Between the Sum of Even and Odd Numbers in an Array
Difficulty: Easy
Topics: Arrays, Mathematical Computations
Description: Write a program to calculate the difference between the sum of even and odd numbers in an array.
Example:
Input: array = [1, 2, 3, 4, 5, 6]
Output: 4
Explanation: The sum of even numbers is 12, and the sum of odd numbers is 8. The difference is 4.
 */
public class Problem49 {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(findDifference(array));
    }

    public static int findDifference(int[] array) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        return evenSum - oddSum;
    }
}
