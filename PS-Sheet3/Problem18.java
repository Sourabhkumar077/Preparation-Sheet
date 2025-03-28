/*
 * Problem 18: Print a Border Pattern with Numbers
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print a border pattern using numbers. The border should be filled with numbers, and the inner part should be empty.

Example 1: Input: n = 4
Output:

1234
1  1
1  1
1234
 */
public class Problem18 {
    public static void main(String[] args) {
      int n = 4; // input value
      printBorderPattern(n);
    }
  
    public static void printBorderPattern(int n) {
      // print top row with numbers
      for (int i = 1; i <= n; i++) {
        System.out.print(i);
      }
      System.out.println();
  
      // print middle rows with border numbers
      for (int i = 1; i <= n - 2; i++) {
        System.out.print(1);
        for (int j = 1; j <= n - 2; j++) {
          System.out.print(" ");
        }
        System.out.print(1);
        System.out.println();
      }
  
      // print bottom row with numbers
      for (int i = 1; i <= n; i++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
