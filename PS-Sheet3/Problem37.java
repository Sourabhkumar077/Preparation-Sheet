/*
 * Problem 37: Print a Cross Pattern with Increasing Size
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a cross pattern where the size of the cross increases with each row. The pattern should be centered.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 ***
  *
 */
public class Problem37 {
    public static void main(String[] args) {
        int n = 3; // input value
        printCrossPattern(n);
    }

    public static void printCrossPattern(int n) {
        // print top half of the cross
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

        // print bottom half of the cross
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
