/*
 * Problem 26: Print a Pattern of Alternating Characters in Rows
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a pattern where rows alternate between two characters.

Example 1: Input: n = 4
Output:

ABAB
BABA
ABAB
BABA
 */
public class Problem26 {
    public static void main(String[] args) {
        int n = 4; // input value
        printAlternatingPattern(n);
    }

    public static void printAlternatingPattern(int n) {
        char c1 = 'A'; // first character
        char c2 = 'B'; // second character
        for (int i = 1; i <= n; i++) {
            // print row
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(c2);
                } else {
                    System.out.print(c1);
                }
            }
            System.out.println();
        }
    }
}
