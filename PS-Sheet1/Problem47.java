/*
 * Generating a Number Pyramid
Difficulty: Medium
Topics: Patterns, Basic Programming
Description: Write a program to generate a pyramid of numbers (e.g., 1, 12, 123, etc.).
Example:
Input: rows = 4
Output:

1  
12  
123  
1234  
 */

import java.util.Scanner;

public class Problem47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        printPattern(rows);
        sc.close();
    }
    public static void printPattern(int row){
        for(int i = 1; i <= row; i++){
            for( int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
