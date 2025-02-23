/*
 * Generating a Matrix with Alternating 0s and 1s
Difficulty: Easy
Topics: Arrays, Matrix Operations
Description: Write a program to generate a matrix where the elements alternate between 0 and 1.
Example:
Input: size = 3
Output:

0 1 0  
1 0 1  
0 1 0  
 */

import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        generateMatrix(size);
    }

    public static void generateMatrix(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
