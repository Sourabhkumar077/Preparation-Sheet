/*
 * Problem 7: Print an Inverted Triangle Pattern
Difficulty: Easy
Topics: Pattern Printing
Hint: Print an inverted triangle pattern with stars (*). Each row should contain decreasing numbers of stars from the top row.

Example 1: Input: n = 5
Output:

*****
 ****
  ***
   **
    *
 */
public class Problem07 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
    public static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // print spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *"); // print asterisks
            }
            System.out.println();
        } 
     }
}