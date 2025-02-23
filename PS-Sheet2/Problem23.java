/*
 * Finding the Sum of Digits of the Product of Two Numbers
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to find the sum of the digits of the product of two given numbers.
Example:
Input: number1 = 12, number2 = 34
Output: 9
Explanation: The product of 12 and 34 is 408, and the sum of its digits is 4 + 0 + 8 = 12.
 */

import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = s.nextInt();
        int sum = sumOfDigits(number1, number2);
        System.out.println("The sum of the digits of the product of " + number1 + " and " + number2 + " is: " + sum);
        s.close();
    }
    public static int sumOfDigits(int number1, int number2) {
        int product = number1 * number2;
        int sum = 0;
        while (product > 0) {
            sum += product % 10;
            product /= 10;
        }
        return sum;
    }
}
