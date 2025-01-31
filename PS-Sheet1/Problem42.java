/*
 * Generating a Fibonacci Sequence Using Recursion
Difficulty: Medium
Topics: Recursion, Sequences
Description: Write a recursive program to generate the Fibonacci sequence up to a given number.
Example:
Input: number = 5
Output: 0, 1, 1, 2, 3
Explanation: The Fibonacci sequence up to 5 is generated.
 */

import java.util.Scanner;

public class Problem42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(generateFibonacci(i) + " ");
        }
        sc.close();
    }
    public static int generateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        // recursive call to function
        return generateFibonacci(n - 1) + generateFibonacci(n - 2);
        
    }
}
