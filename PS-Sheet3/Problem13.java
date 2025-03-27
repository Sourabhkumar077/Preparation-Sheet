
/*
 * Problem 13: Print a Pattern of Consecutive Numbers
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print a matrix of consecutive numbers starting from 1, filling rows sequentially.

Example 1: Input: n = 3
Output:

1 2 3
4 5 6
7 8 9
 */
public class Problem13 {
    public static void main(String[] args) {
        int n = 3;
        printPattern(n);
    }
/*************  ✨ Codeium Command ⭐  *************/
    /**
     * Prints a matrix of size n x n with consecutive numbers starting from 1,
     * filling rows sequentially.
     *
     * @param n the size of the matrix
     */
/******  05c8c6cc-fdf1-4e67-b796-939444205cb9  *******/
    public static void printPattern(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
