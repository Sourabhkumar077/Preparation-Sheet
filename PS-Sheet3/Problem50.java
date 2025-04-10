/*
 * Problem 50: Print a Matrix with Zigzag Pattern of Stars
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a matrix where stars form a zigzag pattern, alternating rows in their positioning.

Example 1: Input: n = 3
Output:

* * *
 * *
* * *
 */
public class Problem50 {
    public static void main(String[] args) {
        int n = 3; // input value
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
