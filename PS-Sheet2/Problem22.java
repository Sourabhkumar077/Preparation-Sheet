/*
 * Generating Pascal’s Triangle Up to N Rows
Difficulty: Medium
Topics: Combinatorics
Description: Write a program to generate Pascal’s Triangle up to N rows.
Example:
Input: N = 3
Output:

1  
1 1  
1 2 1
 */
public class Problem22 {
    public static void main(String[] args) {
        printPascal(3);
    }
    public static void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(findPascal(i, j) + " "); 
            }
            System.out.println(); 
        }
    }    
    public static int findPascal(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        return findPascal(n - 1, r - 1) + findPascal(n - 1, r);
    }
}
