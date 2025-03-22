/*
 * roblem 10: Print a Pyramid Pattern with Numbers
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a pyramid pattern with increasing numbers. Each row should have an increasing sequence of numbers, centered horizontally.

Example 1: Input: n = 3
Output:

  1
 232
34543
 */
public class Problem10 {
  public static void main(String[] args) {
      int n = 3; 
      printPattern(n); 
  }

  public static void printPattern(int n) {
      for (int i = 1; i <= n; i++) {
          // Print leading spaces
          for (int j = 1; j <= n - i; j++) {
              System.out.print(" ");
          }

          // Print increasing numbers
          for (int k = 1; k <= i; k++) {
              System.out.print(i + k - 1);
          }

          // Print decreasing numbers
          for (int k = i - 1; k >= 1; k--) {
              System.out.print(i + k - 1);
          }

          // Move to the next line
          System.out.println();
      }
  }
}
