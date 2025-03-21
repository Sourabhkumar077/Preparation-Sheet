/*
 * Problem 6: Print a Number Triangle
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a right-angle triangle pattern with numbers. Each row should contain an increasing sequence of numbers starting from 1.

Example 1: Input: n = 4
Output:

1
12
123
1234
 */
public class Problem06 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
