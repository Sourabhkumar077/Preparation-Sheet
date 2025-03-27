/*
 *Problem 15: Print a Right-Angle Triangle Pattern with Characters
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a right-angle triangle pattern using characters. Each row should contain the same character repeated according to the row number.

Example 1: Input: n = 3
Output:

A
BB
CCC

 */
public class Problem15 {
    public static void main(String[] args) {
        int n = 3;
        printPattern(n);
    }
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + i - 1) + " ");
            }
            System.out.println();
        }
    }
}
