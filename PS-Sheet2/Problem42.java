/*
 * Finding the Largest Element in Each Row of a Matrix
Difficulty: Easy
Topics: Matrix Operations
Description: Write a program to find the largest element in each row of a matrix.
Example:
Input: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output: [3, 6, 9]
Explanation: The largest elements in each row are 3, 6, and 9.
 */
public class Problem42 {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = largestElementInEachRow(mat);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
    public static int[] largestElementInEachRow(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            result[i] = max;
        }
        return result;
    }
}
