/*
 * Problem 35: Print a Matrix with Spiral Diagonals
Difficulty: Hard
Topics: Matrix Pattern
Hint: Print a matrix with numbers arranged in diagonal spirals. The numbers should fill the matrix in a diagonal spiral fashion.

Example 1: Input: n = 3
Output:

1 2 3
4 5 6
7 8 9
 */
public class Problem35 {
    public static void main(String[] args) {
        int n = 3; // input value
        printSpiralMatrix(n);
    }

    public static void printSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (num <= n * n) {
            // fill top row from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // fill right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // fill bottom row from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // fill left column from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
