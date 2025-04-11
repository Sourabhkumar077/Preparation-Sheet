/*
 * Problem 47: Print a Matrix with Cross Pattern of Numbers
Difficulty: Hard
Topics: Matrix Pattern
Hint: Print a matrix where the center forms a cross pattern with numbers.

Example 1: Input: n = 5
Output:

12321
01210
01210
01210
12321
 */
public class Problem47 {
    public static void main(String[] args) {
        int n = 5; // Size of the matrix, you can modify this value
        printCrossPatternMatrix(n);
    }

    public static void printCrossPatternMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Approach: Print numbers such that the matrix has a cross pattern; both diagonals mirror numbers, and edges taper.
                int value = n - Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print(value);
            }
            System.out.println(); // Move to the next row
        }
    }
}
