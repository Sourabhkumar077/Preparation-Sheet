/*
 * Finding the Sum of the First N Odd Numbers
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to calculate the sum of the first N odd numbers.
Example:
Input: N = 5
Output: 25
Explanation: Sum of the first 5 odd numbers (1 + 3 + 5 + 7 + 9) is 25.
 */

import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range : ");
        int n = sc.nextInt();
        oddNumberSum(n);
        sc.close();
    }

    public static void oddNumberSum(int n) {
        int oddSum = 0;
        int count = 0;
        int i = 1;
        while (count < n) {
            if (i % 2 != 0) {
                oddSum += i;
                count++;
            }
            i++;
        }
        System.out.println("Sum of the first " + count + " odd numbers is " + oddSum);
    }
    
}

