
/*
 * Problem 3: Print a Pyramid Pattern
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a pyramid pattern with stars (*). The pyramid should have a single peak and each row should have an increasing number of stars, centered horizontally.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 */
public class Problem03 {
    public static void main(String[] args) {
       int n = 3;
        printPattern(n);// Call the function with n = 3  
    }
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
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
