/*
 * Problem 43: Print a Pattern with Nested Triangles
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern with nested triangles of stars. Each triangle should be centered and decrease in size.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 ***
  *
 */
public class Problem43 {
  public static void main(String[] args) {
      int n = 3; // input value
      printPattern(n);
  }

  public static void printPattern(int n) {
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
