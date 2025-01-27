/*
Finding the Fibonacci Number at a Specific Position
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to find the Fibonacci number at a specific position.
Example:
Input: position = 5
Output: 5
Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).
 */

import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int position = scanner.nextInt();
        int fibonacciNumber = findFibonacci(position);
        System.out.println("The Fibonacci number at position " + position + " is: " + fibonacciNumber);
        scanner.close();
    }
    public static int findFibonacci(int position) {
        if (position <= 1) {
            return position;
        }
        return findFibonacci(position - 1) + findFibonacci(position - 2);
    }
}
