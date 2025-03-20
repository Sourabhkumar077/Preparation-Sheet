
/*
 * Problem 2: Print a Square of Stars
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a square pattern of stars (*). Each row and column should have the same number of stars.

Example 1: Input: n = 5
Output:

*****
*****
*****
*****
*****
 */
public class Problem02 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);// Call the function with n = 5
    }
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
