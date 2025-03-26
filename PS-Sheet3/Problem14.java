/*
 * Problem 14: Print a Star Pattern with Increasing Width
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern where each row has an increasing width of stars.

Example 1: Input: n = 3
Output:

*
***
*****
 */
public class Problem14 {
    public static void main(String[] args) {
        int size = 3;
        printPattern(size);// Call the function with the desired size       
        
    }
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
