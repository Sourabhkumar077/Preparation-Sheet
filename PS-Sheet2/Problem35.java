
/*
 * Generating a Matrix with a Diagonal Pattern
Difficulty: Medium
Topics: Matrix Operations
Description: Write a program to create a matrix where elements form diagonal lines of a given pattern.
Example:
Input: size = 4
Output:

1 0 0 0  
1 1 0 0  
1 1 1 0  
1 1 1 1  
 */
public class Problem35 {
    public static void printDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = 1;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 4;
        printDiagonalMatrix(size);
    }
}
