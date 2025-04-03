/*
 * Problem 28: Print a Pattern with Diagonal Lines
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a pattern with diagonal lines using characters. Each diagonal line should be aligned properly.

Example 1: Input: n = 4
Output:

A
B B
C   C
D     D
 */
public class Problem28 {
    public static void main(String[] args) {
        int n = 4; // input value
        printDiagonalPattern(n);
    }

    public static void printDiagonalPattern(int n) {
        char c = 'A'; // starting character
        for (int i = 1; i <= n; i++) {
            // print first character
            System.out.print(c);
            // print spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // print second character
            if (i > 1) {
                System.out.print(c);
            }
            System.out.println();
            c++; // increment character
        }
    }
}
