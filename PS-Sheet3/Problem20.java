/*
 * Problem 20: Print a Cross Pattern with Stars
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a cross pattern using stars. The cross should be centered within a matrix.

Example 1: Input: n = 5
Output:

***
  *
  *
  *
***
 */
public class Problem20 {
  public static void main(String[] args) {
    int n = 5; // input value
    printCrossPattern(n);
  }

  public static void printCrossPattern(int n) {
    // print top and bottom rows with stars
    for (int i = 0; i < n; i++) {
      if (i == 0 || i == n - 1) {
        for (int j = 0; j < n; j++) {
          System.out.print("*");
        }
      } else {
        for (int j = 0; j < n; j++) {
          if (j == 0 || j == n - 1 || i == j) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
