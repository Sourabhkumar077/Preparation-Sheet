/*
 * Calculating the Sum of the First N Fibonacci Numbers
Difficulty: Medium
Topics: Fibonacci Sequence, Mathematical Computations
Description: Write a program to calculate the sum of the first N Fibonacci numbers.
Example:
Input: N = 5
Output: 12
Explanation: The first 5 Fibonacci numbers are 1, 1, 2, 3, 5, and their sum is 12.
 */

import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers you want to sum: ");
        int N = sc.nextInt();
        sc.close();
        
        int sum = sumOfFirstNFibonacciNumbers(N);
        System.out.println("Fibonacci sum of first " + N + " numbers is: "+sum);
    }

    public static int sumOfFirstNFibonacciNumbers(int N) {
        int sum = 0;
        int a = 1;
        int b = 1;
        for (int i = 1; i <= N; i++) {
            sum += a;
            int temp = a;
            a = b;
            b = temp + b;
        }
        return sum;
    }
}
