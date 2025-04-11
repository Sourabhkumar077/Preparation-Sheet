/*
 * Problem 48: Print a Pattern with Concentric Squares
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern with concentric squares using stars. The outer square should be larger and each subsequent square should be centered inside.

Example 1: Input: n = 5
Output:

*****
*   *
*   *
*   *
*****
 */
public class Problem48 {
    public static void main(String[] args) {
        int n = 5; // You can change this value to alter the size of the pattern
        printConcentricSquares(n);
    }

    public static void printConcentricSquares(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Approach: Print '*' at the borders (first and last rows/columns) to form a hollow square; inside the borders, print spaces.
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
