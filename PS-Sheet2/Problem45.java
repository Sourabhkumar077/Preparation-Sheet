/*
 * Generating a Matrix with Random Numbers
Difficulty: Easy
Topics: Random Number Generation, Matrix Operations
Description: Write a program to generate a matrix filled with random numbers.
Example:
Input: rows = 2, columns = 3
Output:

3 8 1  
7 4 6 
 */

import java.util.Scanner;

public class Problem45 {
    public static void generateRandomNumMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");        
        int columns = sc.nextInt();
        generateRandomNumMatrix(rows, columns);
    }
}
