/*
 * Problem 45: Print a Pattern with Rows of Increasing Characters
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern where each row contains an increasing sequence of characters.

Example 1: Input: n = 3
Output:

A
BC
DEF
 */
public class Problem45 {
    public static void main(String[] args) {
        int n = 3; // input value
        printPattern(n);
    }

    public static void printPattern(int n) {
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
