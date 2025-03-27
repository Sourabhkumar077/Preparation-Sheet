/*
 * Problem 16: Print a Checkerboard Pattern
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print a checkerboard pattern with two different characters alternating.

Example 1: Input: n = 4
Output:

XOXOXO
OXOXOX
XOXOXO
OXOXOX
 */
public class Problem16 {
    public static void main(String[] args) {
     int n = 4;
     printPattern(n);   
    }
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O " );
                }
            }
            System.out.println();
        }
    }   
}
