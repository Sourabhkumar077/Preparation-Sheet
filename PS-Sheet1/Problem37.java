/*
 * Checking for Perfect Squares
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to determine if a number is a perfect square.
Example:
Input: number = 16
Output: True
Explanation: 16 is a perfect square (4^2 = 16).
 */

import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }
    }

    static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
