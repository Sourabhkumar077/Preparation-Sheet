/*
 * Problem 24: Print a Pattern of Increasing and Decreasing Stars
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a pattern where stars increase to a midpoint and then decrease.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 ***
  *
 */
public class Problem24 {
    public static void main(String[] args) {
        int n = 3; // input value
        printStarPattern(n);
    }

    public static void printStarPattern(int n) {
        // print increasing stars
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // print decreasing stars
        for (int i = n - 1; i >= 1; i--) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
