/*
 * Problem 46: Print a Star Pattern with Diamond Shape and Numbers
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern with a diamond shape of stars, with numbers inside the diamond.

Example 1: Input: n = 3
Output:

  1
 121
12321
 121
  1
 */
public class Problem46 {
  public static void main(String[] args) {
      int n = 3; // You can change this value to alter the size of the diamond
      printDiamondPattern(n);
  }

  public static void printDiamondPattern(int n) {
      // Approach: Print a diamond-shaped pattern with stars at borders and numbers in the center, growing and shrinking across rows.
      for (int i = 1; i <= n; i++) {
          printRow(n, i);
      }
      for (int i = n - 1; i >= 1; i--) {
          printRow(n, i);
      }
  }

  public static void printRow(int n, int row) {
      for (int space = 1; space <= n - row; space++) {
          System.out.print(" "); // Print leading spaces
      }
      for (int num = 1; num <= row; num++) {
          System.out.print(num); // Print ascending numbers
      }
      for (int num = row - 1; num >= 1; num--) {
          System.out.print(num); // Print descending numbers
      }
      System.out.println(); // Move to the next row
  }
}
