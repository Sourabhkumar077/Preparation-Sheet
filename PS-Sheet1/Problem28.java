/*
 * inding the Sum of the Digits of the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of the digits of the factorial of a given number.
Example:
Input: number = 4
Output: 9
Explanation: The factorial of 4 is 24, and the sum of the digits (2 + 4) is 6.
 */

import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        int factorial = factorial(number);
        int sum = sumOfDigits(factorial);
        System.out.println("The sum of the digits of the factorial of " + number + " is: " + sum);
        s.close();
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; 
        }
        System.out.print("Factorial of " + n + " is: " + result + "\n");
        return result;
    }
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
