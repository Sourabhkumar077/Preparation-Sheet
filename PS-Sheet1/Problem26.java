/*
 * Checking if a Number is a Narcissistic Number
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is a narcissistic number (where the sum of its digits raised to the power of the number of digits equals the number itself).
Example:
Input: number = 153
Output: Narcissistic Number
Explanation: 153 is a narcissistic number because 1^3 + 5^3 + 3^3 = 153.
 */

import java.util.Scanner;

public class Problem26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        if (isNarcissistic(number)) {
            System.out.println("Narcissistic Number");
        } else {
            System.out.println("Not a Narcissistic Number");
        }
        scan.close();
    }
    private static boolean isNarcissistic(int number) {
        int temp = number;
        int sum = 0;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        return sum == number;
    }
    
}
