/*
 *Problem 34: Print a Pattern with Increasing Characters in Columns
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern where each column contains increasing characters from A.

Example 1: Input: n = 3
Output:

A
B C
D E F 
 */
public class Problem34 {
    public static void main(String[] args) {
        int n = 3; // input value
        printIncreasingColumns(n);
    }

    public static void printIncreasingColumns(int n) {
        char c = 'A'; // starting character
        for (int i = 1; i <= n; i++) {
            // print row
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++; // increment character
            }
            System.out.println();
        }
    }
}
