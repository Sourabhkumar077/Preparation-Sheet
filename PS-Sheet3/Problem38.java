/*
 * Problem 38: Print a Pattern of Alternating Triangles
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern with alternating triangles of stars. The triangles should alternate direction.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 ***
  *
 */
public class Problem38 {
    public static void main(String[] args) {
        int n = 3; // input value
        printAlternatingTriangles(n);
    }

    public static void printAlternatingTriangles(int n) {
        // print top half of the pattern
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // print bottom half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
