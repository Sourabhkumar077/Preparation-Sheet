/*
 * Problem 25: Print a Matrix with Zigzag Pattern
Difficulty: Hard
Topics: Matrix Pattern
Hint: Print a matrix with a zigzag pattern of numbers. The numbers should alternate direction row-wise.

Example 1: Input: n = 3
Output:

1 2 3 4
8 7 6 5
9 10 11 12

 */
public class Problem25 {
    public static void main(String[] args) {
        int n = 3; // input value
        printZigzagMatrix(n);
    }

    public static void printZigzagMatrix(int n) {
        int[][] matrix = new int[n][n * 2];
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // even row, print from left to right
                for (int j = 0; j < n * 2; j++) {
                    matrix[i][j] = num++;
                }
            } else { // odd row, print from right to left
                for (int j = n * 2 - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        // print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
