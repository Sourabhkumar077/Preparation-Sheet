/*
 * Problem 22: Print a Diamond Pattern with Increasing Width
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a diamond pattern where each line has increasing width of stars.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 ***
  *
 */
public class Problem22 {
  public static void main(String[] args) {
      int n = 3; // input value
      printDiamondPattern(n);
  }

  public static void printDiamondPattern(int n) {
      // print top half of the diamond
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

      // print bottom half of the diamond
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
