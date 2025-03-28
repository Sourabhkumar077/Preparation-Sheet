/*
 * Problem 19: Print an Inverted Pyramid Pattern with Characters
Difficulty: Medium
Topics: Pattern Printing
Hint: Print an inverted pyramid pattern using characters. Each row should have decreasing characters from the top row.

Example 1: Input: n = 3
Output:

CCC
 BB
  A
 */
public class Problem19 {
    public static void main(String[] args) {
       int n = 3;
       printPattern(n); 
    }
    public static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int= j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
