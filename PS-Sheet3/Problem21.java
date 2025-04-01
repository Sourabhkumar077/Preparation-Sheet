/*
 * Problem 21: Print a Spiral Matrix
Difficulty: Hard
Topics: Matrix Pattern
Hint: Print a matrix filled with numbers in a spiral pattern. The numbers should start from 1 and increment as you move around the spiral.

Example 1: Input: n = 3
Output:

1 2 3
8 9 4
7 6 5
 */
public class Problem21 {
    public static void main(String[] args) {
        int n = 3; // input value
        printPattern(n);
    }

    public static void printPattern(int size) {
        int[][] matrix = new int[size][size];
        int num = 1;
        int top = 0, bottom = size - 1, left = 0, right = size - 1;

        while (num <= size * size) {
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
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
