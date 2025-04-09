/*
 * Problem 41: Print a Pattern with Spiral and Zigzag
Difficulty: Hard
Topics: Matrix Pattern
Hint: Print a matrix with both spiral and zigzag patterns. The matrix should first fill in a spiral pattern and then in a zigzag fashion.

Example 1: Input: n = 3
Output:

1 2 3
6 5 4
7 8 9

 */
public class Problem41 {
    public static void main(String[] args) {
        int n = 3; // input value
        printPattern(n);
    }

    public static void printPattern(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // fill top row from left to right
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = num++;
            }
            rowStart++;

            // fill right column from top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++;
            }
            colEnd--;

            // fill bottom row from right to left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i] = num++;
                }
                rowEnd--;
            }

            // fill left column from bottom to top
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = num++;
                }
                colStart++;
            }
        }

        // print matrix in zigzag pattern
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
