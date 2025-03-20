/*
 * Difficulty: Easy
Topics: Pattern Printing
Hint: Print a right-angle triangle pattern of stars (*). Each row should contain an increasing number of stars, starting from 1 star in the first row.

Example 1: Input: n = 4
Output:

*
**
***
****
 */

public class Problem01 {

    public static void main(String[] args) {
       int rows = 4;
        printPattern(rows);
        
    }
    public static void printPattern(int rows) { 
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}