/*
 * Generating a Square Matrix of a Given Size
Difficulty: Medium
Topics: Arrays, Matrix Operations
Description: Write a program to generate a square matrix of a given size and fill it with sequential numbers.
Example:
Input: size = 3
Output:

1 2 3  
4 5 6  
7 8 9  
 */

import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();
        generateSquareMatrix(size);
    }
    public static void generateSquareMatrix(int size) {
        int[][] matrix = new int[size][size];
        int num = 1;
        // loop to generate the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = num++;
            }
        }
        // loop to print the matrix
        for (int i = 0; i < size; i++) {
            System.out.print("[ ");
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" ]");
            System.out.println();
        }
    }
}
