/*
 * Checking for Perfect Squares in a Range
Difficulty: Easy
Topics: Mathematical Comput

ations
Description: Write a program to check which numbers in a given range are perfect squares.
Example:
Input: start = 1, end = 10
Output: [1, 4, 9]
Explanation: Perfect squares between 1 and 10 are 1, 4, and 9.
 */

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range : ");
        int start = sc.nextInt();
        System.out.print("Enter end of range : ");
        int end = sc.nextInt();
        perfectSquareInRange(start, end);
        sc.close();
    }

    public static void perfectSquareInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPerfectSquare(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
