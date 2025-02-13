
/*
 * Finding the GCD of Multiple Numbers
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to find the GCD (Greatest Common Divisor) of an array of numbers.
Example:
Input: array = [12, 24, 36]
Output: 12
Explanation: The GCD of 12, 24, and 36 is 12.
 */

public class Problem08 {
    public static void main(String[] args) {
        int arr[] = {12, 24, 36}; 
        System.out.println("GCD of array: " + findGcd(arr));
    }

    // Function to find GCD of two numbers using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find GCD of an array
    public static int findGcd(int[] arr) {
        int result = arr[0]; // Start with first element
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }
}