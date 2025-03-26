/*
 * Problem 11: Print a Pattern of Alternating 0s and 1s
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print a matrix where elements alternate between 0 and 1. The pattern should alternate both row-wise and column-wise.

Example 1: Input: n = 4
Output:

0101
1010
0101
1010
 */

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// Get the size of the matrix from the user
        printPattern(n);
        sc.close();
    }
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }
}
