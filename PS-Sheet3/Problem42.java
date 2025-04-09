/*
 * Problem 42: Print a Pattern of Alternating Characters in Matrix
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a matrix where characters alternate in each cell to form a pattern.

Example 1: Input: n = 3
Output:

ABAB
BABA
ABAB
 */
public class Problem42 {
    public static void main(String[] args) {
        int n = 3; // input value
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("B");
                } else {
                    System.out.print("A");
                }
            }
            System.out.println();
        }
    }
}
