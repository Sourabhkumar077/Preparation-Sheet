/*
 * Problem 44: Print a Matrix with Increasing Rows and Columns
Difficulty: Easy
Topics: Matrix Pattern
Hint: Print a matrix where each row and column contains increasing numbers.

Example 1: Input: n = 3
Output:

1 2 3
4 5 6
7 8 9
 */
public class Problem44 {
    public static void main(String[] args) {
        int n = 3; // input value
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
