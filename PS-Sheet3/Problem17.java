/*
 * Problem 17: Print a Pyramid Pattern of Increasing Stars
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pyramid pattern where each row increases in the number of stars.

Example 1: Input: n = 3
Output:

  *
 ***
*****
 */
public class Problem17 {
    public static void main(String[] args) {
       int n = 3;
       printPattern(n); 
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
