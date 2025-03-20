
/*
 * Problem 4: Print a Diamond Pattern
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a diamond pattern with stars (*). The pattern should include a single peak in the middle with symmetric rows above and below it.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 ***
  *
 */
public class Problem04 {
    public static void main(String[] args) {
        int n = 3;
        printDiamond(n);// Call the function with n = 3
    }
    public static void printDiamond(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
