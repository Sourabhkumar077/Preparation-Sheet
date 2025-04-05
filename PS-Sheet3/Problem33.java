/*
 * Problem 33: Print a Pattern of Nested Squares
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern with nested squares using stars. The outermost square should be filled with stars, and each subsequent square should be smaller and centered inside the previous one.

Example 1: Input: n = 5
Output:

*****
*   *
*   *
*   *
*****
 */
public class Problem33 {
    public static void main(String[] args) {
        int n = 5;  // You can change this value to test other inputs
        printNestedSquares(n);
    }

    public static void printNestedSquares(int n) {
        char[][] matrix = new char[n][n];

        // Fill with spaces initially
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ' ';
            }
        }

        // Number of layers = (n + 1) / 2
        for (int layer = 0; layer <= n / 2; layer += 2) {
            // Top and Bottom rows of current square
            for (int i = layer; i < n - layer; i++) {
                matrix[layer][i] = '*'; // top
                matrix[n - 1 - layer][i] = '*'; // bottom
            }

            // Left and Right columns of current square
            for (int i = layer + 1; i < n - 1 - layer; i++) {
                matrix[i][layer] = '*'; // left
                matrix[i][n - 1 - layer] = '*'; // right
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

