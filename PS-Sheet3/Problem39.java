/*
 * Problem 39: Print a Matrix with Diamond Pattern of Numbers
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a matrix where numbers form a diamond pattern. The numbers should increase and decrease symmetrically around the center.

Example 1: Input: n = 3
Output:

  1
 121
12321
 121
  1
 */public class Problem39 {
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
                System.out.print(i + j - 1 + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(i + j - 2 + " ");
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
                System.out.print(i + j - 1 + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(i + j - 2 + " ");
            }
            System.out.println();
        }
    }
}
