/*
 * Problem 9: Print a Right-Angle Triangle of Numbers
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a right-angle triangle pattern with increasing numbers. Each row should contain a continuous sequence of increasing numbers.

Example 1: Input: n = 4
Output:

1
23
456
78910
 */
public class Problem09 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
    public static void printPattern(int n) {
       int num = 1;
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(num + " "); // print numbers
               num++;
           }
           System.out.println();
       } 
    }
}
