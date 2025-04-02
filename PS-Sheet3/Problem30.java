/*
 * Problem 30: Print a Cross Pattern of Stars with Diagonals
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a cross pattern using stars with intersecting diagonals.

Example 1: Input: n = 5
Output:

* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
 */
public class Problem30 {
    public static void main(String[] args) {
        int n = 5; // input value
        printCrossPattern(n);
    }

    public static void printCrossPattern(int n) {
        // print top half of the cross
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // print bottom half of the cross
        for (int i = n - 2; i >= 0; i--) {
            // print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
