/*
 * Finding All Divisors of the Product of Two Numbers
Difficulty: Medium
Topics: Number Theory
Description: Write a program to find all divisors of the product of two given numbers.
Example:
Input: number1 = 6, number2 = 10
Output: [1, 2, 3, 5, 6, 10, 15, 30]
Explanation: The product of 6 and 10 is 60, and its divisors are listed.
 */

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int number2 = sc.nextInt();
        int[] divisors = findDivisors(number1, number2);
        System.out.print("The divisors of the product of " + number1 + " and " + number2 + " are: ");
        for (int divisor : divisors) {
            if (divisor != 0) {
            System.out.print(divisor + " ");
            }   
        }
        sc.close();
    }

    public static int[] findDivisors(int number1, int number2) {
        int product = number1 * number2;
        int[] divisors = new int[product + 1];
        for (int i = 1; i <= product; i++) {
            if (product % i == 0) {
                divisors[i] = i;
            }
        }
        return divisors;
}
}
