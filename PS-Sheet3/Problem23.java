/*
 * Problem 23: Print a Diamond Pattern with Numbers Increasing
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a diamond pattern where numbers increase. Each row should show a symmetrical pattern with numbers increasing towards the center.

Example 1: Input: n = 3
Output:

  1
 121
12321
 121
  1
 */
public class Problem23 {
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
          // print numbers
          for (int j = 1; j <= i; j++) {
              System.out.print(j);
          }
          // print numbers in reverse order
          for (int j = i - 1; j >= 1; j--) {
              System.out.print(j);
          }
          System.out.println();
      }

      // print bottom half of the diamond
      for (int i = n - 1; i >= 1; i--) {
          // print spaces
          for (int j = 1; j <= n - i; j++) {
              System.out.print(" ");
          }
          // print numbers
          for (int j = 1; j <= i; j++) {
              System.out.print(j);
          }
          // print numbers in reverse order
          for (int j = i - 1; j >= 1; j--) {
              System.out.print(j);
          }
          System.out.println();
      }
  }
}
