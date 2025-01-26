/*
Finding the Number of Digits in a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to count the number of digits in a given number.
Example:
Input: number = 12345
Output: 5
Explanation: The number 12345 has 5 digits
 */

import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int number = sc.nextInt();
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of Digits in a Number : " + count);
        sc.close();
    }
}
