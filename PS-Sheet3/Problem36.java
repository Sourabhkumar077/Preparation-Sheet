/*
 * Problem 36: Print a Checkerboard Pattern with Increasing Size
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a checkerboard pattern where the size of each square increases as you move along the matrix.

Example 1: Input: n = 3
Output:

XOX
OXO
XOX
 */
public class Problem36 {
    public static void main(String[] args) {
        int n = 3; // input value
        printCheckerboardPattern(n);
    }

    public static void printCheckerboardPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
    }
}
