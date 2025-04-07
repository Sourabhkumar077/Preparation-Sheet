/*
 * Problem 32: Print a Star Pattern with Increasing and Decreasing Width
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern with stars that increase to a midpoint and then decrease. The stars should be centered horizontally.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 ***
  *

 */
public class Problem32 {
  public static void main(String[] args) {
      int n = 3; // input value
      printStarPattern(n);
  }

  public static void printStarPattern(int n) {
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
