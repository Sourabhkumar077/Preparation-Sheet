/*
 * Problem 29: Print a Matrix with Diamond Pattern of Numbers
Difficulty: Hard
Topics: Matrix Pattern
Hint: Print a matrix where elements follow a diamond pattern with numbers.

Example 1: Input: n = 3
Output:

  1
 121
12321
 121
  1
 */
public class Problem29 {
    public static void main(String[] args) {
        int n = 3; // input value
        printDiamondMatrix(n);
    }

    public static void printDiamondMatrix(int n) {
        // print top half of the diamond
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // print numbers in reverse order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // print bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // print numbers in reverse order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
