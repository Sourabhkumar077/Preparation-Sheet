/*
 * Problem 27: Print a Number Pyramid Pattern with Characters
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a pyramid pattern using increasing characters, where each row increases in width and character range.

Example 1: Input: n = 3
Output:

  A
 BCD
EFGHI
 */
public class Problem27 {
  public static void main(String[] args) {
      int n = 3; // input value
      printPyramidPattern(n);
  }

  public static void printPyramidPattern(int n) {
      char c = 'A'; // starting character
      for (int i = 1; i <= n; i++) {
          // print spaces
          for (int j = 1; j <= n - i; j++) {
              System.out.print(" ");
          }
          // print characters
          for (int j = 1; j <= i * 2 - 1; j++) {
              System.out.print(c);
              c++; // increment character
          }
          System.out.println();
      }
  }
}
