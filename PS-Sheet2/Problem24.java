/*
 * Checking for Palindromic Numbers in a Range
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to check for palindromic numbers within a given range.
Example:
Input: start = 1, end = 100
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99]
Explanation: Palindromic numbers between 1 and 100 are the numbers listed.
 */

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range : ");
        int start = sc.nextInt();
        System.out.print("Enter end of range : ");
        int end = sc.nextInt();
        palindromeInRange(start, end);
        sc.close();
    }

    public static void palindromeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        return num == reverse;
    }
}
