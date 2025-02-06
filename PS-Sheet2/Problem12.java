/*
 * Generating a Matrix of Fibonacci Numbers
Difficulty: Medium
Topics: Arrays, Matrix Operations
Description: Write a program to generate a matrix where each element is a Fibonacci number.
Example:
Input: size = 3
Output:

1 1 2  
3 5 8  
13 21 34  
 */

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int row = sc.nextInt();
        sc.close();
        int[][] matrix = fibonaccimatrix(row);
        for (int index = 0; index < row; index++) {
            for (int i = 0; i < row; i++) {
                System.out.print(matrix[index][i] + " ");
            }
            System.out.println();
        }
        
    }

    private static int[][] fibonaccimatrix(int row) {
        int matrix[][]  = new int[row][row];
        int a = 0, b = 1;
        int nextFib = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = a;
                nextFib = a + b;
                a = b;
                b = nextFib;

            }
        }
        return matrix;
    }

}
