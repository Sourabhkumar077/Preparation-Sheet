/*
 * Generating a Matrix with a Spiral Pattern
Difficulty: Medium
Topics: Arrays, Matrix Operations
Description: Write a program to generate a matrix filled with numbers in a spiral pattern.
Example:
Input: size = 3
Output:
    1 2 3  
    8 9 4  
    7 6 5 
 */

 import java.util.Scanner;

 public class Problem17 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size: ");
         int size = sc.nextInt();
         sc.close();
         spiralMatrix(size);
     }
 
     static void spiralMatrix(int size) {
         int[][] matrix = new int[size][size];
         int rowStart = 0, rowEnd = size - 1;
         int colStart = 0, colEnd = size - 1;
         int num = 1;
 
         while (rowStart <= rowEnd && colStart <= colEnd) {
             // Fill top row (left to right)
             for (int i = colStart; i <= colEnd; i++) {
                 matrix[rowStart][i] = num++;
             }
             rowStart++;  // Move downward
 
             // Fill right column (top to bottom)
             for (int i = rowStart; i <= rowEnd; i++) {
                 matrix[i][colEnd] = num++;
             }
             colEnd--;  // Move leftward
 
             // Fill bottom row (right to left) - Only if still within bounds
             if (rowStart <= rowEnd) {
                 for (int i = colEnd; i >= colStart; i--) {
                     matrix[rowEnd][i] = num++;
                 }
                 rowEnd--;  // Move upward
             }
 
             // Fill left column (bottom to top) - Only if still within bounds
             if (colStart <= colEnd) {
                 for (int i = rowEnd; i >= rowStart; i--) {
                     matrix[i][colStart] = num++;
                 }
                 colStart++;  // Move rightward
             }
         }
 
         // Print the spiral matrix
         for (int[] row : matrix) {
             for (int val : row) {
                 System.out.print(val + " ");
             }
             System.out.println();
         }
     }
 }
 