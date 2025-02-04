/*
 * Finding the Sum of Digits of a Number Until Zero
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to repeatedly sum the digits of a number until the result is zero.
Example:
Input: number = 123
Output: 6
Explanation: Sum of digits is 1 + 2 + 3 = 6; sum of digits of 6 is 6 (which is a single digit).
 */

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();
        digitSum(number);
        sc.close();

    }
    public static void digitSum(int num){
        int sum = 0;
        while( num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if(sum > 9){
            digitSum(num);
        }

        System.out.println(sum);
    }
}