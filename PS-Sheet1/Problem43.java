/*
 * Finding All Divisors of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find all divisors of a given number.
Example:
Input: number = 12
Output: 1, 2, 3, 4, 6, 12
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, and 12.
 */

import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        findDivisors(number);
    }

    public static void findDivisors(int number) {
        System.out.print("The divisors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                System.out.print(i + ",");
            }
        }
    }
}
