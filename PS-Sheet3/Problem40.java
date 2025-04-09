/*
 * Problem 40: Print a Star Pattern with Increasing Width and Centered
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern where the width of stars increases, and the stars are centered horizontally.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 */
public class Problem40 {
    public static void main(String[] args) {
        int n = 3; // input value
        printStarPattern(n);
    }

    public static void printStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
