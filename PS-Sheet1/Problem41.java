/*
 * Finding the Count of Specific Digits in a Number
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to count the occurrences of a specific digit in a number.
Example:
Input: number = 122333, digit = 3
Output: 3
Explanation: The digit 3 occurs 3 times in the number 122333.
 */

import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer number = sc.nextInt();
        System.out.print("Enter a digit: ");
        Integer digit = sc.nextInt();
        sc.close();
        countOfOcuurences(number, digit);
    }

    public static void countOfOcuurences(Integer number, Integer digit) {
        int count = 0;
        char digitChar = Character.forDigit(digit, 10);
        String num = number.toString();
        for (int i = 0; i < num.length(); i++) {
            if (digitChar == num.charAt(i)) {
                count++;
            }
        }
         System.out.println("The digit " + digitChar + " occurs " + count + " times in the number " + number);

    }
}
