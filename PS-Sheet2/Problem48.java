/*
 * Generating a Square Matrix with Random Values
Difficulty: Easy
Topics: Random Number Generation, Matrix Operations
Description: Write a program to generate a square matrix where each element is a random value.
Example:
Input: size = 3
Output:

7 3 5  
2 6 9  
1 8 4
 */

import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = sc.nextInt();
        sc.close();
        generateMatrixRandom(size);
    }
    public static void generateMatrixRandom(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((int) (Math.random() * 10) + " ");
            }
            System.out.println();
        }
    }
}
