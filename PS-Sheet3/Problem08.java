/*
 * Problem 8: Print a Diamond Pattern with Numbers
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a diamond pattern with numbers. The pattern should have a peak in the middle with symmetric rows above and below it.

Example 1: Input: n = 3
Output:

  1
 121
12321
 121
  1
 */
/*
 * Problem 8: Print a Diamond Pattern with Numbers
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a diamond pattern with numbers. The pattern should have a peak in the middle with symmetric rows above and below it.

Example 1: Input: n = 3
Output:

  1
 121
12321
 121
  1
 */
public class Problem08 {
  public static void main(String[] args) {
      int size = 3;
      printPattern(size);
  }

  public static void printPattern(int size) {
      // Upper half of the pattern
      for (int i = 1; i <= size; i++) {
          // Print leading spaces
          for (int j = 1; j <= size - i; j++) {
              System.out.print(" ");
          }
          // Print increasing numbers
          for (int j = 1; j <= i; j++) {
              System.out.print(j);
          }
          // Print decreasing numbers
          for (int j = i - 1; j >= 1; j--) {
              System.out.print(j);
          }
          System.out.println();
      }

      // Lower half of the pattern
      for (int i = size - 1; i >= 1; i--) {
          // Print leading spaces
          for (int j = 1; j <= size - i; j++) {
              System.out.print(" ");
          }
          // Print increasing numbers
          for (int j = 1; j <= i; j++) {
              System.out.print(j);
          }
          // Print decreasing numbers
          for (int j = i - 1; j >= 1; j--) {
              System.out.print(j);
          }
          System.out.println();
      }
  }
}


