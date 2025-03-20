
/*
 * Problem 5: Print a Hollow Square of Stars
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a hollow square pattern with stars (*). The border of the square should be filled with stars while the inner part should be empty.

Example 1: Input: n = 5
Output:

*****
*   *
*   *
*   *
*****

 */
public class Problem05 {
    public static void main(String[] args) {
       int n = 5;
       printHollowSquare(n);// Call the function with n = 5 
    }
    public static void printHollowSquare(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
