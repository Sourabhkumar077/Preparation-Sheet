/*
 * Generating a Pascal’s Triangle
Difficulty: Medium
Topics: Arrays, Mathematical Computations
Description: Write a program to generate Pascal's Triangle up to a given number of rows.
Example:
Input: rows = 4
Output:

    1  
    1 1  
    1 2 1  
    1 3 3 1  
Explanation: Pascal's Triangle with 4 rows is generated.
 */

import java.util.Scanner;
/** Generated a pascal triangle
 *  Each row corresponds to the binomial coefficients.
 *  The value at each position is the sum of the two numbers directly above it.
 */

public class Problem31 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        printPascal(rows);
        sc.close();
    }
    public static void printPascal(int rows) {
        for (int i = 0; i < rows; i++) {
            int num = 1;  
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
