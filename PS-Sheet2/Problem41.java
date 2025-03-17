
/*
 * Generating a Pattern of Increasing Numbers
Difficulty: Easy
Topics: Patterns
Description: Write a program to create a pattern where numbers increase with each row.
Example:
Input: rows = 3
Output:

1  
12  
123  
 */
public class Problem41 {
    public static void main(String[] args) {
        int rows = 3;
        printPattern(rows);
    }
    public static void printPattern(int rows) {
        // Write your code here
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
